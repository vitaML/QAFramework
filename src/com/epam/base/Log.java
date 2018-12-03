package com.epam.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private Logger logger;

    public Log(Class clazz){
        logger = LoggerFactory.getLogger(clazz);
    }

    public Logger getLogger(){
        return logger;
    }
}
