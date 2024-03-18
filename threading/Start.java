class Start extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i+1);
            try{Thread.sleep(500);}
            catch(InterruptedException e){};
        }
    }
    public static void main(String[] args) {
        Start obj = new Start();
        Start obj2 = new Start();
        obj.start();
        obj2.start();
    }
}