package com.miskevich.web.controller;

import com.miskevich.entity.LibStatistic;
import com.miskevich.service.ILibCheckerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class LibCheckerController {

    @Autowired
    private ILibCheckerService libCheckerService;

    @RequestMapping(value = "/report")
    public LibStatistic getAll() {
        //log.info("Sending request to get all reports");
        LibStatistic libStatistic = libCheckerService.getLibStatistic();
        libStatistic.setId(1);
        libStatistic.setName("name");
        return libStatistic;
    }
}
