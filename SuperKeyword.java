package teluskoyt;

class X {
    int i = 5;
    void show(){
        System.out.println("Inside X show , i = "+i);
    }
}

class Y extends X {
    @Override   //compulsory u have k
    void show(){
        super.show();
        super.i=10;
        System.out.println("Inside Y show , i = "+i);
        super.show();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        X obj = new Y();
        obj.show();
    }
}
