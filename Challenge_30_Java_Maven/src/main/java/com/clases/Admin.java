package com.clases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
    private static Logger logger = LogManager.getLogger(Admin.class);
    public void agregar(){
        logger.info("Mensaje Info");
        logger.warn("Mensaje Warn");
        logger.trace("Mensaje Trace");
        logger.error("Mensaje Error");
        logger.debug("Mensaje Debug");
    }
}
