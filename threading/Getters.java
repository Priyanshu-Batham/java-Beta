public class Getters extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            // System.out.println(i+1);
            try{Thread.sleep(100);}
            catch(InterruptedException e){};
        }
    }
    public static void main(String[] args) {
        Getters obj = new Getters();
        obj.start();
        System.out.println("Name: " + obj.getName());
        System.out.println("Id: " + obj.getId());
        System.out.println("Priority: " + obj.getPriority());
        System.out.println("State: " + obj.getState()); 
        /*
        Thread State
        1) NEW: before start
        2) RUNNABLE: running
        3) TERMINATED: died
        4) TIMED-WAITING: Thread.sleep() is used 
         */
    }
}
