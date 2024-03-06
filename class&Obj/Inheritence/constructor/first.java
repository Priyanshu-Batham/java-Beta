class X{
    int a;

    X(){
        a = 10;
        System.out.println("Constructor of X");
    }
}

class Y extends X{
    String b;

    Y(){
        b = "hello";
    }

    void display(){
        System.out.println(b);
    }
}


class first{
    public static void main(String args[]){
        Y obj = new Y();
        obj.display();
    }
}