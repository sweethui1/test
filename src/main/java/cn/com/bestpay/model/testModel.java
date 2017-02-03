package main.java.cn.com.bestpay.model;

/**
 * Created by user on 2016/9/22.
 */
public class testModel implements Cloneable {
    private String test1;
    private String test2;

    public testModel(String test1,String test2){
        this.test1 = test1;
        this.test2 = test2;
    };
    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "testModel{" +
                "test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }

    @Override
    public testModel clone() throws CloneNotSupportedException{
        return (testModel) super.clone();
    }

}
