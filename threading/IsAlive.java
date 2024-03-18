class IsAlive extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            try{Thread.sleep(100);}
            catch(Exception e){};
        }
    }
    public static void main(String[] args) {
        IsAlive obj = new IsAlive();

        System.out.println(obj.isAlive());

        obj.start();

        try{
            System.out.println(obj.isAlive());
            obj.join();
        }
        catch(Exception e){};

        System.out.println(obj.isAlive());

    }
}
