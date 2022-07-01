package teluskoyt;
/*
1. Whenever you inherit a abstract class , we use extend keyword
    while inheriting a interface class , we use implement keyword
2. Like abstract class we cannot create the object of interface classes , 
    but we can create reference of them 
3. To achieve multiple inheritance  we can implement as many interface classes as we want,
     but normal or abstract class can be inherited only once.
4.Methods of interface are by default public abstract , so we cannot define their bodies 
5.Use abstract if u want to declare methods , otherwise always go for interfaces in the long run😉
*/

interface Writing {
    void write(); //cannot declare methods
    
}

class Pen implements Writing {  // e can implement multiples class d, f, g , h ... but can extend only 1 class

    public void write() {
        System.out.println("I am a Pen");
    }
}

class Pencil implements Writing {
    
    public void write() {
        System.out.println("I am a Pencil");
    }
    
}

class ToolKit {
    public void writeWithSomething(Writing w){
        w.write();
    }
}
public class Interface {

    public static void main(String[] args) {
        
        
        ToolKit t = new ToolKit();
        Pen p = new Pen();
        Pencil pc = new Pencil();
        
        t.writeWithSomething(p);
        t.writeWithSomething(pc); //working by passing pencil object also and pen object also
    }
    
}
