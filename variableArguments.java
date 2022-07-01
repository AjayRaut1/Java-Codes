package teluskoyt;

class calc{
    void add(int ... n){
        int sum=0;
        for( int k : n){
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
public class variableArguments {
    public static void main(String args[]){
        calc obj = new calc();
        obj.add(1231,124,15);
        obj.add();
        obj.add(12,32,443,213,4343,23,2343,3);      //i can pass variable length of arguments , starting from 0 to any length , it will be given as array 
        
    }
}
