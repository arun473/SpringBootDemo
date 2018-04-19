package com.example.multithreading;

public class NetworkPrinterB implements NetworkPrinter{
    @Override
    public synchronized void printPage(String threadid) {
        snooze(threadid);
        System.out.println("NetworkPrinterA : Page Printed");
    }

    @Override
    public synchronized void faxPage(String threadid) {
        snooze(threadid);
        System.out.println("NetworkPrinterA : Page Faxed");
    }

    public static void snooze(String threadid){
        try {
            System.out.println(threadid+" : started");
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
