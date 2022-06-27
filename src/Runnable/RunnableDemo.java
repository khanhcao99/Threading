package Runnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
    }

    @Override
    synchronized public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    synchronized public void start(){
        System.out.println("Starting " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
