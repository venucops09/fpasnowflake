package com.example.fpasnowflake.service;

import com.example.fpasnowflake.mapper.FpaEntityMapper;
import com.example.fpasnowflake.model.FpaFile;
import com.example.fpasnowflake.repository.FpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FpaService implements IFpaService {

    @Autowired
    FpaRepository fpaRepository;
    @Autowired
    FpaEntityMapper fpaEntityMapper;


    @Override
    public FpaFile getFpaFile(int id) {
        return fpaEntityMapper.toDto(fpaRepository.getFpa(Integer.valueOf(id)));
    }

    @Override
    public String postFpaFile(FpaFile fpaFile) {

        try{
            fpaRepository.save(fpaEntityMapper.toEntity(fpaFile));
        }catch (Throwable e){
            throw e;
        }

        return "successfully saved into the table";
    }

    @Override
    public List<FpaFile> getAllFpaFiles() {
        try {
            return fpaEntityMapper.toDtoList(fpaRepository.getAllFpa());
        }catch (Throwable e) {
            throw e;
        }
    }
}
