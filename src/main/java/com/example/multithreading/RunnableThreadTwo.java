package com.example.multithreading;

public class RunnableThreadTwo implements Runnable{
    NetworkPrinter networkPrinter;
    RunnableThreadTwo(){

    }
    RunnableThreadTwo(NetworkPrinter networkPrinter){
        this.networkPrinter=networkPrinter;
    }

    @Override
    public void run() {
        networkPrinter.printPage(Thread.currentThread().getName());
    }
}
