package main.java.MultiThreading;

public class Client {
    public static void main(String[] args) {
        System.out.println("Curent thread: "+ Thread.currentThread().getName());
        HelloWorldPrinter printer= new HelloWorldPrinter();
        Thread t1= new Thread(printer);
        t1.start();
    }
}
