package com.revature.p1backend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
 
@SpringBootApplication
public class log4j2Controller  extends SpringBootServletInitializer {
 
  private static final Logger LOGGER = LogManager.getLogger(log4j2Controller.class);
 
  public static void main(String[] args)
    {
        @SuppressWarnings("unused")
		ApplicationContext ctx = SpringApplication.run(log4j2Controller.class, args);
         
        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
    }
}

