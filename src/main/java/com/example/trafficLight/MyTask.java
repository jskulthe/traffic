package com.example.trafficLight;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask
{
    private String name;
    public MyTask(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(Thread.currentThread() + " executing " +
                           this.name + " [" +
                           new Date() + "]");
    }
}