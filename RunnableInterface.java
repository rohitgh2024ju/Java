public class RunnableInterface {

    public static void main(String[] args) {

        Runnable task = new TaskClass();

        Thread t = new Thread(task);

        t.start();
    }
}

class TaskClass implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}