package main.java.cn.com.bestpay.test;

/**
 * Created by user on 2016/9/22.
 * 线程类
 */
public  class DoSomething implements Runnable {
    private String name;

    public DoSomething(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println(name + ":" + i);
            }
        } catch (Exception e){
            System.out.println("线程异常："+e);
        }

    }

   // public abstract int process();

    public static void main(String[] args) {
        //测试实现runnable 线程
        DoSomething dt1 = new DoSomething("王蕙");
        DoSomething dt2 = new DoSomething("小二");

        Thread thread1 = new Thread(dt1);
        Thread thread2 = new Thread(dt2);

        thread1.start();
        thread2.start();

    }

}
