package teluskoyt;

class Outer{
    public void display(){
        System.out.println("inside outer display");
    }
    class Inner{
        public void display(){
            System.out.println("inside inner display");
        }
    }
    static class Inner2{
        public void display(){
            System.out.println("inside inner static display");
        }
    }
}

public class innerClass {
    public static void main(String args[]){
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner(); //inner class can be access using outer.inner ; inner constructor can be access by outer object for creating inner object
        Outer.Inner2 obj2 = new Outer.Inner2(); //no need of obj to access static classes, directly outer class name can be used
        
        obj.display();
        obj1.display();
        obj2.display();
    }
}
