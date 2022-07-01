package teluskoyt;

class V {               //final class cannot be inherited
    final int i = 40;
    final String DAY ;
    V(){
        //i = 20;       //cannnot change a final variable
        DAY = "Sunday";
    }
    
    final void show() {
        System.out.println("in V show");
    }
}

class W extends V {
    //show() of W cannot be override show() of V because it is a final method
    void show1() {
        System.out.println("in W show");
    }
}
public class FinalKeyword {

    public static void main(String[] args) {
        V obj = new V();
        System.out.println(obj.i); 
        
        W obj1 = new W();
        obj1.show1();        
    }
    
}
