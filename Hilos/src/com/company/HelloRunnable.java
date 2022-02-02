package com.company;

import java.sql.SQLOutput;

public class HelloRunnable implements Runnable{


    @Override
    public void run(){
        for (int i = 0; i<1000;i++){
            System.out.println(i + "R:" +Thread.currentThread().getName());
        }

    }
}
