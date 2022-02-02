package com.company;

public class HelloThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i<1000;i++){
            System.out.println(i + "T:" +Thread.currentThread().getName());
        }
    }
}
