package com.example.fpasnowflake.service;

import com.example.fpasnowflake.model.FpaFile;

import java.util.List;

public interface IFpaService {

    FpaFile getFpaFile(int id);

    String postFpaFile(FpaFile fpaFile);

    List<FpaFile> getAllFpaFiles();
}
