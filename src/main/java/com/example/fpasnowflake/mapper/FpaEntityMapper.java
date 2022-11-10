package com.example.fpasnowflake.mapper;

import com.example.fpasnowflake.entity.FpaFileEntity;
import com.example.fpasnowflake.model.FpaFile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FpaEntityMapper {

    FpaEntityMapper INSTANCE = Mappers.getMapper(FpaEntityMapper.class);

    List<FpaFile> toDtoList(List<FpaFileEntity> fpaFileEntityList);
    FpaFile toDto(FpaFileEntity fpaEntity);
    FpaFileEntity toEntity(FpaFile fpaFile);
}
