package MyMethodsPackage;

public class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        // Simulating some time-consuming operation
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Increment the counter
        count++;

        // Print the current count and thread
        System.out.println("Count: " + count + " | Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Creating a shared Counter instance
        Counter counter = new Counter();

        // Creating multiple threads that increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
