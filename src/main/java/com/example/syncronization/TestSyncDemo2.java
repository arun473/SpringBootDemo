package com.example.syncronization;

public class TestSyncDemo2 {
    private static final Object obj = new Object();

    public  void s1(int threadId)
    {   System.out.println("I am from Method s1()");
        synchronized(obj) {
            snooze(threadId);
            System.out.println("Sync static s1 "+  threadId);
        }

    }

    public void s2(int threadId)
    {
        System.out.println("I am from Method s2()");
        synchronized(obj) {
            snooze(threadId);
            System.out.println("Sync static s2 "+  threadId);
        }

    }

    public void n2(int threadId)
    {
        snooze(threadId);
        System.out.println(" non static n2 " + threadId);
    }

    static void snooze(int threadId)
    {
        System.out.println("Waiting ... "+ threadId);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        TestSyncDemo2  s1 = new TestSyncDemo2();
        TestSyncDemo2 s2 = new TestSyncDemo2();

        Runnable r1=new Runnable() {
            public void run() {
                s1.s1(10);
            }
        };


        Runnable r2=new Runnable() {
            //s1.n2(30);
            public void run() {
                s2.s2(20);
            }

            //

        };

        Thread t1=new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();

    }
}