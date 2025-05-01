package SIngleton_pattern_thread;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public synchronized static Singleton getInstance() {
        // This is not thread-safe and will fail in a multi-threaded environment
        if (instance == null) {
            instance = new Singleton(); // A new instance is created if it's null
        }
        return instance;
    }
}

