package com.company;

public class SynchronizedThread extends Thread{
    Counter counter;


    public SynchronizedThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        counter.increasePrint(Thread.currentThread().getName());
    }
}
