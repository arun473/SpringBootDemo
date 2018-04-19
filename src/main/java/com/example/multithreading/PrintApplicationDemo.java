package com.example.multithreading;

public class PrintApplicationDemo {
    public static void main(String[] args){

        NetworkPrinterA networkPrinterA = new NetworkPrinterA();

        RunnableThreadOne runnableThreadOne = new RunnableThreadOne(networkPrinterA);
        //RunnableThreadTwo runnableThreadTwo = new RunnableThreadTwo(networkPrinterA);

        Thread t1 = new Thread(runnableThreadOne);
        Thread t2 = new Thread(runnableThreadOne);

        t1.start();
        t2.start();


    }
}
