package teluskoyt;

interface i {
    void show();
    default void display(){     //using defalut i can write body of methods in interface and also override them
        System.out.println("I am 120hz display");
    }
}
public class DefaultMethod {

    public static void main(String[] args) {
        i obj = new iImpl(); 
        obj.display();      //I am also able to call the display method which is inside interface
    }

    static class iImpl implements i {
        @Override
        public void show() {
        }
    }
    
}
