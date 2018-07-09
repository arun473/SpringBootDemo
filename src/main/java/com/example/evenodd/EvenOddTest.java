package com.example.evenodd;


class Even implements Runnable{



    private Object lock;



    public Even(Object lock) {

        this.lock = lock;

    }



    @Override

    public void run() {

        synchronized(lock){

            System.out.println("Even Entered..");

            for(int i=0;i<10;i++){



                if(i%2==0){

                    System.out.println("Even : "+i);

                    try {

                        lock.wait();

                    } catch (InterruptedException e) {

                        // TODO Auto-generated catch block

                        e.printStackTrace();

                    }



                }//else{



                //}

                lock.notifyAll();





            }

        }

    }



}



class Odd implements Runnable{



    private Object lock;





    public Odd(Object lock) {

        this.lock = lock;

    }





    @Override

    public void run() {



        synchronized(lock){

            System.out.println("Odd Entered..");

            for(int i=0;i<10;i++){



                if(i%2!=0){

                    System.out.println("Odd : "+i);

                    try {

                        lock.wait();

                    } catch (InterruptedException e) {

                        // TODO Auto-generated catch block

                        e.printStackTrace();

                    }

                }/*else{



                        }*/

                lock.notifyAll();





            }

        }



    }



}



public class EvenOddTest {



    public static void main(String[] args) {

        final Object lock = new Object();

        //final Object lock1 = new Object();

        Even e = new Even(lock);

        Odd o = new Odd(lock);



        Thread t1 = new Thread(e);

        Thread t2 = new Thread(o);



        t1.start();

        t2.start();

    }



}