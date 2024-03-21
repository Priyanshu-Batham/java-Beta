public class Yield extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }

    public static void main(String[] args) {
        Yield thread1 = new Yield();
        // Yield thread2 = new Yield();
        thread1.start();
        // thread2.start();
        for (int i = 0; i < 100; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}
