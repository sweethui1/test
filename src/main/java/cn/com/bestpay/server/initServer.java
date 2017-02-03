package main.java.cn.com.bestpay.server;

import org.apache.log4j.PropertyConfigurator;

/**
 * Created by user on 2017/1/23.
 */
public class initServer {

    public static void init(){
        //加载配置文件
        PropertyConfigurator.configure(ClassLoader.getSystemResource("logback.xml"));
//        ClassLoader.getSystemResourceAsStream("log4j.xml");
    }

}
