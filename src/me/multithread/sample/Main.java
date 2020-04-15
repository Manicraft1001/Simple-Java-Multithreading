package me.multithread.sample;

public class Main {

    public static void main(String[] args) {
        new SampleThread("Thread 1");
        new SampleThread("Thread 2");
        new SampleThread("Thread 3");

        System.out.println("Main thread terminated");
    }

}
