class Sleep extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.err.println(i+1);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        Sleep obj = new Sleep();
        Sleep obj2 = new Sleep();
        obj.start();

        try{
            Thread.sleep(3000);
        }
        catch(Exception e){}
        
        obj2.start();
    }
}