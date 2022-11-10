package com.example.fpasnowflake.service;

import com.example.fpasnowflake.mapper.FpaEntityMapper;
import com.example.fpasnowflake.model.FpaFile;
import com.example.fpasnowflake.repository.FpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        fpaRepository.save(fpaEntityMapper.toEntity(fpaFile));
        return "success";
    }
}
