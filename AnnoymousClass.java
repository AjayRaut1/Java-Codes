package teluskoyt;

class I {
    void display() {
        System.out.println("I am one & only A");
    }
}
class J extends I {
    void display() {
        System.out.println("I am one & only B");
    }
}

public class AnnoymousClass {
    public static void main(String[] args) {
        I obj = new I();
        obj.display();
        
        I obj1 = new J();   //Now to call different display() only , i have created a completely new class J and nothing else
        obj1.display();
    
        I obj3 = new I()
                {
                    void display(){
                        //This is anynomous class local to this scope only and overiding I() class methods
                        System.out.println("I am the best");
                    }
//                     void display22(){        // i can create non overiding methods but cannot call them without overiding
//                        System.out.println("I am the be");
//                    }                                 
                };
        obj3.display();
        //obj3.display22(); i cannot call a non overided method
    }
    
}
