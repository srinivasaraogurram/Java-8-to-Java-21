package com.learnJava;

public class Main {
    public static void main(String[] args) {
        // Using a traditional anonymous class to create a Runnable

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread");
            }
        };

        // Starting a new thread with the Runnable
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // Main thread continues to run
        System.out.println("Main thread is running");
        // Using a method reference to create a Runnable
        // Runnable runnable2 = RunnableLambdaExample::runMethod;
        // Using a lambda expression to create a Runnable
        // () -> {}
        Runnable runnable = () -> {
            System.out.println("Running in a separate thread");
        };
        // Starting a new thread with the Runnable
        Thread thread = new Thread(runnable);
        thread.start();
        // Main thread continues to run
        System.out.println("Main thread is running");

        Runnable runnable3 = () -> System.out.println("Running in a separate thread ");
        Thread thread3 = new Thread(runnable3);
        thread3.start();
        System.out.println("Main thread is running");

        new Thread(() -> {
            System.out.println("Running in a separate thread 4");
        }).start();
        System.out.println("Main thread is running");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread 5");
            }
        });

        Runnable runnable4 = () -> {
            System.out.println("Running in a separate thread 6");
            System.out.println("Running in a separate thread 7");
        };
        Thread thread4 = new Thread(runnable4);
        thread4.start();
        System.out.println("Main thread is running");

    }
}