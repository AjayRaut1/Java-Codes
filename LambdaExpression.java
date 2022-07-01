package teluskoyt;

interface kuchToBhi{
    void OnlyOneMethod();
}

public class LambdaExpression {

    public static void main(String[] args) {
        
        kuchToBhi obj =() -> System.out.println("lamda expression works only in single / functional interfaces with support of all features of scala language which doesn't have redundant code like boiler plate codes in Java 1.7 or before");
        
        obj.OnlyOneMethod();
        
    }
    
}
