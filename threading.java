public class threading {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int count = 1; count <= 5; count++) {
                System.out.println(Thread.currentThread().getName()
                        + " - Count: " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName()
                            + " was interrupted.");
                    return;
                }
            }
        };

        Thread firstThread = new Thread(task, "Thread-1");
        Thread secondThread = new Thread(task, "Thread-2");

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Both threads completed.");
    }
}
