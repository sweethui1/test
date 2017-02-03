package main.java.cn.com.bestpay.quartz;

import org.apache.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by user on 2017/1/5.
 */
public class initQuartz {
    static Logger log = Logger.getLogger(initQuartz.class);
    public static void main(String[] args) throws Exception{
        testJob();
    }

    /**
     * 定时器实例 1
     * SimpleTrigger 用于简单时间设置，setRepeatInterval
     * **/
    public  static void testJob() throws Exception{
        //创建scheduler工厂
        SchedulerFactory factory = new StdSchedulerFactory();
        //获取调度实例
        Scheduler scheduler= factory.getScheduler();
//        Scheduler scheduler1=StdSchedulerFactory.getDefaultScheduler();
        //实现作业程序jobDetail
        JobDetail jobDetail = new JobDetail("test","testGroup",quartzDemoJob.class);
        //创建触发器
        SimpleTrigger trigger = new SimpleTrigger("test","testGroup");
        long date =System.currentTimeMillis();
        trigger.setStartTime(new Date(date));
        trigger.setRepeatCount(5);         //重复次数
        trigger.setRepeatInterval(2000);   //时间间隔
        //将作业和触发器设置到调试程序中
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
//        System.out.println("===定时任务1启动成功===");
        log.info("===定时任务1启动成功===");


    }

    /**
     * 定时任务实例2
     * Crontrigger 用于复杂时间设置
     * 一个Job可以对应 多个Trigger，但一个Trigger只能对应一个Job
     * 一个新的scheduler 或是处于standby状态的scheduler可以调用start方法
     *
     * **/

     public static void test2(){

        try    {
            StdSchedulerFactory factory = new StdSchedulerFactory();
            Scheduler scheduler = factory.getScheduler();

            JobDetail jobDetail = new JobDetail("name","group",quartzDemoJob.class);

            CronTrigger trigger = new CronTrigger("name","group");

            trigger.setCronExpression("0 55 17 * * ?");
            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.start();
            System.out.println("====定时任务2启动成功====");
        }   catch  (Exception e)   {
            e.printStackTrace();
        }
    }
}
