package com.example.fpasnowflake.controller;

import com.example.fpasnowflake.entity.FpaFileEntity;
import com.example.fpasnowflake.model.FpaFile;
import com.example.fpasnowflake.service.FpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class FpaSnowflakeController {

    @Autowired
    FpaService fpaService;

    @GetMapping(value = "/getFpa/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public FpaFile getFpaFile(@PathVariable int id){
        return fpaService.getFpaFile(id);
    }

    @PostMapping(value = "/postFpa", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getFpaFile(@RequestBody FpaFile fpaFile){
        return fpaService.postFpaFile(fpaFile);
    }

}
