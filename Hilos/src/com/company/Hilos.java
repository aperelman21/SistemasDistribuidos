package com.company;

public class Hilos {

    public static void main(String[] args) {
//        HelloThread h1 = new HelloThread();
//        Thread h2 = new Thread(new HelloRunnable());
//        h1.start(); //con .run se ejecutan en el mismo hilo del main
//        try {
//            h1.join(); //corre siempre primero el hilo 1
//            //Thread.sleep(1000 ); // esta durmiendo al main
//        } catch (Exception e){
//            System.out.println(e);
//        }
//
//        h2.start(); //con .start, se ejecutan concurrentemente con el main
//
//        System.out.println("M:" +Thread.currentThread().getName());
        Counter counter = new Counter(0);
        SynchronizedThread h1 = new SynchronizedThread(counter);
        SynchronizedThread h2 = new SynchronizedThread(counter);
        h1.start();
        h2.start();


    }
}
