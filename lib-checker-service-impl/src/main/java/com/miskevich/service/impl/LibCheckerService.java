package com.miskevich.service.impl;

import com.miskevich.dao.ILibCheckerDao;
import com.miskevich.entity.LibStatistic;
import com.miskevich.service.ILibCheckerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LibCheckerService implements ILibCheckerService {

    @Autowired
    private ILibCheckerDao libCheckerDao;

    public LibStatistic getLibStatistic() {
        //log.info("Service layer");
        libCheckerDao.getLibStatistic();
        return new LibStatistic();
    }
}
