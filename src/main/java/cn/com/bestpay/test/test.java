package main.java.cn.com.bestpay.test;

import main.java.cn.com.bestpay.model.testModel;

/**
 * Created by user on wanghui 2016/9/22.
 */
public class test {

    public static void main(String[] args) throws Exception{
        //测试clone对象方法
        testModel tm = new testModel("1","2");
        testModel tm1 = tm.clone();

        System.out.println(tm.toString());
        System.out.println(tm1.toString());

    }
}
