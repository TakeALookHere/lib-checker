package com.miskevich.dao.memory;

import com.miskevich.dao.ILibCheckerDao;
import com.miskevich.entity.LibStatistic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class LibCheckerDao implements ILibCheckerDao {

    public LibStatistic getLibStatistic() {
        //log.info("Dao layer");
        return new LibStatistic();
    }
}
