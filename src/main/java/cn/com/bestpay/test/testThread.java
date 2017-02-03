package main.java.cn.com.bestpay.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 2016/9/22.
 */
public class testThread extends Thread {
    private String name;
    private String num;

    public testThread(String name,String num){
        this.name = name;
        this.num = num;
    }

    @Override
    public void run(){
        try {

            System.out.println(name + ":" + num);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args)throws Exception{
        //继承thread类 实现线程
//        testThread t1 = new testThread("小三");
//        testThread t2 = new testThread("小四");
//
//        t1.start();
//        t2.start();

        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 6 ; i++) {
            String  num = "2"+i;
            threadPool.execute(new testThread("小"+i,num));   //执行线程
        }
    }
}
