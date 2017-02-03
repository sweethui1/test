package main.java.cn.com.bestpay.test;

/**
 * Created by user on 2016/9/22.
 */
public abstract class CSSRunable implements Runnable {

    @Override
    public void run(){
        try{
            process();
        } catch (Exception  e){
            System.out.println("线程异常："+ e );
        }
    }

    public abstract int process();

}
