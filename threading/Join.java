public class Join extends Thread{
    public void run(){
        // System.out.println(Thread.currentThread().getName());

        for(int i = 0; i<10; i++){
            System.err.println(i+1);
            try{Thread.sleep(1000);}
            catch(InterruptedException e){};
        }
    }
    public static void main(String[] args) {
        Join obj = new Join();
        Join obj2 = new Join();

        obj.start();
        
        try{
            obj.join(3000);
        }
        catch(InterruptedException e){};
        
        obj2.start();
    }
}

