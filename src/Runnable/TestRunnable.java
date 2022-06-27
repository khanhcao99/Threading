package Runnable;

public class TestRunnable {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Databas");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-HR-Databas");
        runnableDemo1.start();
        runnableDemo2.start();
        System.out.println("Main thread stopped!!!");
    }
}
