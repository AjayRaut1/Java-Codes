package teluskoyt;

abstract class Human{          //we cannot access abstract clas methods directly 
    abstract void eat();       //Abstract method don't have a body // Abstract methods have to be complusory inside a abstracct class
    void sleep(){};            //Abstract class have non - abstract methods as well as abstract methods
    void repeat(){};
};

class Man extends Human {       //This class is called as concrete class also
    void eat(){                 //compulsory i have to write eat() function as it is abstract in human class
        System.out.println("I am eating");
    }
};

abstract class Woman extends Human {
    
}
public class AbstractClass {
    public static void main(String[] args) {
        Human referance =  new Man();
        referance.eat();
        System.out.println("Abstract Classes can be used :\n1.If we want to use/expand it in future \n2.We don't want anybody to make object of it\n");
    }
    
}
