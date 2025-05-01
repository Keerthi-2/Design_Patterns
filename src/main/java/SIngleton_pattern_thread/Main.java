package SIngleton_pattern_thread;

public class Main {
    public static void main(String[] args) {
        // Create multiple threads to test the Singleton behavior
        Task task = new Task();

        // Creating 10 threads that try to access the Singleton instance
        for (int i = 0; i < 100; i++) {
            new Thread(task).start();
        }

    }
}
