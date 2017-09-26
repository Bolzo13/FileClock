package testfiletime;


public class TestFileClock {

    public static void main(String[] args) throws InterruptedException {
        Thread[] thread = new Thread[10];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new FileClock(thread, i));
        }
        startThreads(thread);
    }

    private static void startThreads(Thread[] thread) {
        for (Thread thread1 : thread) {
            thread1.start();
        }
    }
}
