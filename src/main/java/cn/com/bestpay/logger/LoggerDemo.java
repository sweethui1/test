package main.java.cn.com.bestpay.logger;

import main.java.cn.com.bestpay.server.initServer;
import org.slf4j.LoggerFactory;

/**
 * Created by user on 2017/1/23.
 */
public class LoggerDemo {
//    public static Logger log  = Logger.getLogger(LoggerDemo.class);
    org.slf4j.Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public void logTest() {
        logger.info("this is a message");
        logger.info("hi welcome {},today is {}","admin","sunday");
    }

}

 class test{
     public static void main(String[] args) {
         initServer.init();
         LoggerDemo log = new LoggerDemo();
         log.logTest();

     }
}


