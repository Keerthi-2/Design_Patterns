package SIngleton_pattern_thread;



public class Task implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);
    }
}

