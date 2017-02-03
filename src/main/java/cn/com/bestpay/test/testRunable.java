package main.java.cn.com.bestpay.test;

/**
 * Created by user on 2016/9/22.
 */
//@Slf4j
public class testRunable extends CSSRunable {
    private String name;

    public testRunable(String name){
        this.name = name;
    }

    @Override
    public int process(){
        testRunable runable = new testRunable("小五");
        for (int i = 0; i < 5; i++) {
            System.out.println(runable.name + ":" + i);
        }
        return 1;
    }
}
