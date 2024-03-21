public class Daemon extends Thread{

    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i+1);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        Daemon obj = new Daemon();
        obj.setDaemon(true);
        obj.start();
    }
}
