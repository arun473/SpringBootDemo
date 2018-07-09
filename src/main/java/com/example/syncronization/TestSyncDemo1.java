package com.example.syncronization;

public class TestSyncDemo1 {
    //private static SingletonExample singleton = null;
    public TestSyncDemo1(){ //Hides constructor from public view
    }

    public static synchronized void s1(int threadId)
    {
        snooze(threadId);
        System.out.println("Sync static s1 "+  threadId);
    }

    public static synchronized void s2(int threadId)
    {
        snooze(threadId);
        System.out.println("Sync static s2 "+  threadId);
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
        TestSyncDemo1  s1 = new TestSyncDemo1();
        TestSyncDemo1 s2 = new TestSyncDemo1();

        Runnable r1=()-> {
            s1.s1(10);
        };

  /*  Runnable r1= new Runnable() {

     public void run() {
      s1.s1(10);
     }
    };*/

        Runnable r2=()-> {
            s2.s2(20);
        };

        Thread t1=new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();

    }
}