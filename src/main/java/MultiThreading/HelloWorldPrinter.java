package main.java.MultiThreading;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Worlf from "+ Thread.currentThread().getName());
    }
}
