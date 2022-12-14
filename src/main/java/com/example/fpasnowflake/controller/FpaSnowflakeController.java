package com.example.fpasnowflake.controller;

import com.example.fpasnowflake.model.FpaFile;
import com.example.fpasnowflake.service.FpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class FpaSnowflakeController {

    @Autowired
    FpaService fpaService;

    @GetMapping
    public String welcome(){
        return "welcom to google auth";
    }

    @GetMapping(value = "/getFpa/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public FpaFile getFpaFile(@PathVariable int id){
        return fpaService.getFpaFile(id);
    }

    @GetMapping(value = "/getAllFpa", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FpaFile> getFpaFile(){
            return fpaService.getAllFpaFiles();
    }
    /**postfpafile method*/
    @PostMapping(value = "/postFpa", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postFpaFile(@RequestBody FpaFile fpaFile){
            return fpaService.postFpaFile(fpaFile);
    }

}
