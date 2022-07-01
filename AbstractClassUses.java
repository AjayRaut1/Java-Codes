package teluskoyt;

 class writer{
    void write(){
        System.out.println("I write");
    }
}

class pen extends writer {   
    void write(String ink){
        super.write();
        System.out.println("I write with pen " + ink);
    }
}

class pencil extends writer {
    void write(double ink){
        System.out.println("I write with pencil " + ink);
    }
}

public class AbstractClassUses {
    public static void main(String[] args) {
        pen obj = new pen(); 
//        obj.write(2.2);
        obj.write("aj");
    }
    
}
