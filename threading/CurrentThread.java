public class CurrentThread extends Thread{
    public void run(){
        System.out.println("Sub Thread: " + Thread.currentThread());
    }
    public static void main(String[] args) {
        CurrentThread obj = new CurrentThread();
        obj.start();
        System.out.println("Main: " + Thread.currentThread());

        Thread ref = Thread.currentThread();
        System.out.println(ref.getName());
    }
}
