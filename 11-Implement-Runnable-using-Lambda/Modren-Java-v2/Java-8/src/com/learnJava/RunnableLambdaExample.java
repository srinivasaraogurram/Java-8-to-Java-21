package com.learnJava;

public class RunnableLambdaExample {
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
    }
}
