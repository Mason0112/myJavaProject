package org.example.fire;

public class Mama {
    public Mama() {
        try {
            System.out.println("dish #1 strat");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("dish #1 finish");

            /*
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
            */

            /*
            new Ming(){
                @Override
                public void buySoy() {
                    try {
                        Thread.sleep(7000);
                        System.out.println("buy soy ok");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            */

            System.out.println("dish #2 strat");
            MingThread mingThread = new MingThread();
            mingThread.start();

            Thread MingThread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("go buy soy2");
                    try {
                        sleep(7000);
                        System.out.println("buy soy ok2");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            MingThread2.start();

            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("dish #2 finish");


            System.out.println("dish #3 strat");
            Thread.sleep(5000);
            System.out.println("dish #3 finish");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        new Mama();


    }

}
