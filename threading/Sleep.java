class Sleep extends Thread{
    @Override
    public void run(){
        System.out.println("Inside "+Thread.currentThread().getName());
        for(int i = 0; i< Integer.MAX_VALUE; i++){
            // System.err.println(i+1);
            // try{
            //     Thread.sleep(1000);
            // }
            // catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        Sleep obj = new Sleep();
        
        obj.start();

        System.out.println("Outside "+Thread.currentThread().getName());
    }
}