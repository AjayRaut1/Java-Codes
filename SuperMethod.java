package teluskoyt;

class A {
    A(){
        System.out.println("inside A");
    }
    A(int a){
        System.out.println("inside parametrized A");
    }
}

class B extends A {
    B(){
        super();    //by creating an object of B defalut constructor is invoked and it first calls the A class default constructor using super() method
        System.out.println("inside B");
    }
    B(int b){
        //super();    //by default the super() method will call A() class default constructor 
        super(56);    //but if I want to call the parametrized constructor then super(pass an argument) should be used
        System.out.println("insider parametrized B");
    }
}

public class SuperMethod {
    public static void main(String args[]){
        B obj1 = new B();     //defalut constructor of B is called
        B obj2 = new B(5);    //parametrized constructor of B is invoked
    }
}