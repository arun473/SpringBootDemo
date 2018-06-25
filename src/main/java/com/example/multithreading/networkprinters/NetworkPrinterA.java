package com.example.multithreading.networkprinters;

public class NetworkPrinterA implements NetworkPrinter{
    private Object lock = new Object();
   /* @Override
    public synchronized void printPage(String threadid) {
        snooze(threadid);
        System.out.println("NetworkPrinterA : Page Printed");
    }

    @Override
    public synchronized void faxPage(String threadid) {
        snooze(threadid);
        System.out.println("NetworkPrinterA : Page Faxed");
    }*/

    @Override
    public  void printPage(String threadid) {
        synchronized (this){
            snooze(threadid);
            System.out.println("NetworkPrinterA : Page Printed");
        }

    }

    @Override
    public  void faxPage(String threadid) {
        synchronized (lock) {
            snooze(threadid);
            System.out.println("NetworkPrinterA : Page Faxed");
        }
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


