package com.gmm;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Created by john on 2017-04-29.
 */
@SpringBootApplication
public class Application {

    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        logger.info("=====Spring Boot start success====");
    }

}
