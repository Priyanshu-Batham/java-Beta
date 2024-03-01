import java.io.*;

interface Radio{
    void nextChannel();
    void prevChannel();
}

interface Calculator{
    int add(int a, int b);
    int sub(int a, int b);
}

interface FlashLight{
    void toggleFlash();
}


public class SmartPhone implements Radio, Calculator, FlashLight{
    boolean FlashLight = false;
    float channelNo = 98.5f;

    @Override
    public void nextChannel(){
        System.out.println("Going to the next station");
        this.channelNo += 1;
    }

    @Override
    public void prevChannel() {
        System.out.println("Going to the previous Station");
        this.channelNo -= 1;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public void toggleFlash() {
        this.FlashLight = !this.FlashLight;
    }

    // ------------------------------------------>>>>>
    // calling the main function

    public static void main(String args[]){
        SmartPhone realme = new SmartPhone();
        System.out.println(realme.FlashLight);
        realme.toggleFlash();
        System.out.println(realme.FlashLight);

        System.out.println(realme.channelNo);
        realme.nextChannel();
        System.out.println(realme.channelNo);

        System.out.println(realme.add(2, 5));
    }
}


