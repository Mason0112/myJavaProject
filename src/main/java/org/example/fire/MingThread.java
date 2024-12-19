package org.example.fire;

public class MingThread  extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("go buy soy");
        try {
            sleep(7000);
            System.out.println("buy soy ok");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
