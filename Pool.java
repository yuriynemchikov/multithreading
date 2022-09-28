import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Pool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 5; i++) {
            executor.submit(new Work(i));
        }

        executor.shutdown();
        System.out.println("All tasks was submitted");

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task " + id + " was completed");
    }
}

