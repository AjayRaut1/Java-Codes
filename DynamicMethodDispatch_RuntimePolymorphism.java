package teluskoyt;

class Animal {
    void sound() {
        System.out.println("I am a Animal"); 
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("bhau bhau ");
    }
}

class Cat extends Animal{
    void sound() {
        System.out.println("mew mew");
    }
}

public class DynamicMethodDispatch_RuntimePolymorphism {
    public static void main(String[] args) {
        
        Animal obj = new Animal();      //object of animal and referance of animal
        obj.sound();                    //so the method sound() will be of animal class
    
        Animal obj1 = new Dog();        //object of dog and referance of animal
        obj1.sound();                   //so the method sound() will be of dog class
        
        Animal obj2 = new Cat();        //object of cat and referance of animal
        obj2.sound();                   //so the method sound() will be of cat class
    }
    
}

/*
    Runtime Polymorphism
    1) the referance and object are linked at the runtime (run time polymorphism)
    2) so the method to be called depends on , which class object is created (dynamic method dispatch)
    3) this is called as dynamic method dispatch , that the method to be called depends upon which class object created , which is decided at the run time by the JVM 
       i.e the dynamic binding / run time polymorphism / late binding
*/