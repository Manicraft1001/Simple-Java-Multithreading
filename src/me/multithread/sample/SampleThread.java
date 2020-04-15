package me.multithread.sample;

import java.util.concurrent.TimeUnit;

public class SampleThread implements Runnable {

    private String name;
    private int i = 5;

    public SampleThread(String name) {
        this.name = name;

        Thread t = new Thread(this, name);
        System.out.println("New thread started: " + t.getClass().getName());
        t.start();
    }

    @Override
    public void run() {
        while (i > 0) {
            i--;
            System.out.println("Thread \""+this.name+"\": "+i);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Thread \""+this.name+"\" got terminated by an exception.");
            }
        }
    }
}
