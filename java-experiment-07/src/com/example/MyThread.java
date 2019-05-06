package com.example;

import java.time.LocalTime;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(LocalTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
