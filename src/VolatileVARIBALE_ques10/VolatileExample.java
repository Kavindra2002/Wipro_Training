package VolatileVARIBALE_ques10;

//volatile: Ensures visibility of changes to variables across threads. Prevents thread caching of variables.

public class VolatileExample {
    private volatile boolean flag = true;

    void stop() {
        flag = false;
    }

    void run() {
        while (flag) {
            System.out.println("Running...");
        }
        System.out.println("Stopped.");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();

        Thread t1 = new Thread(() -> {
            example.run();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            example.stop();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
