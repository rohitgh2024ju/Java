package chap9practice;

public class GreetThread {
    public static void main(String[] args) {
        Runnable morningObj = new MorningClass(1000);
        Runnable welcomeObj = new WelcomeClass(1000);

        Thread t1 = new Thread(morningObj);
        Thread t2 = new Thread(welcomeObj);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }

}

class MorningClass implements Runnable {
    int n;

    MorningClass(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        morningGreet();
    }

    public void morningGreet() {
        for (int i = 0; i < this.n; i++) {
            System.out.println("Good Morning: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeClass implements Runnable {
    int n;

    WelcomeClass(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        welcomeGreet();
    }

    public void welcomeGreet() {
        for (int i = 0; i < this.n; i++) {
            System.out.println("Welcome: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}