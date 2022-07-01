package teluskoyt;



public class WrapperClass {
    public static void main(String[] args) {
        
        int i = 10 ; //this is a primitive data type fetched form C language, it is more faster than refranced/object/wrapped data type ,
                     //use for normal cases
        Integer ii = new Integer(i);   // ii is a referance pointing to object integer containing 10
                                        // it is a slow data type , but there are places where primitive data types are not allowed like hypernet , api collection
                                        //the primitive data 10 is boxed or packed inside a object , so it is called as BOXING / WRAPPING
        int value = ii.intValue();      //It is called as unboxing/unwrapping because we are fetching the value stored inside ii and storing into a primitve data type
    
        String s = "12233";
        
        //typecasting(String -> Integer)
        int n = Integer.parseInt(s);    //parseInt() cannot be included directly because it is a static method
        System.out.println(n);
    }
    
}
