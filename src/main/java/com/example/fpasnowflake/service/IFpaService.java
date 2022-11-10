package com.example.fpasnowflake.service;

import com.example.fpasnowflake.model.FpaFile;

public interface IFpaService {

    FpaFile getFpaFile(int id);

    String postFpaFile(FpaFile fpaFile);
}
