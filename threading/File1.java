class File1{
    public static void main(String args[]){
        Subclass obj = new Subclass("priyanshu");
        Subclass obj2 = new Subclass("batham");
        obj.start();
        obj2.start();
    }    
}
class Subclass extends Thread{
    String name;
    public Subclass(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(name);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}