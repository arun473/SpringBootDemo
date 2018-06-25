package com.example.multithreading.networkprinters;

public class RunnableThreadOne implements Runnable{

    NetworkPrinter networkPrinter;
    RunnableThreadOne(){

    }
    RunnableThreadOne(NetworkPrinter networkPrinter){
        this.networkPrinter=networkPrinter;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Thread-0"))
            networkPrinter.printPage(Thread.currentThread().getName());
        else if(Thread.currentThread().getName().equals("Thread-1"))
            networkPrinter.faxPage(Thread.currentThread().getName());
    }
}
