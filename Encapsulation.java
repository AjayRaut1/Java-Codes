package teluskoyt;
/*
    make the data fields private always so that main cannot access them directly
    set the private fileds using setters and return the values using getters 
    this is called as encapsulation i.e access data through methods (data is binded with method )
    we can maintain a lock file which will tell the file is modified or accessed
    before accessing a file we can show error , or check if the user is logged in or not
*/
class Student {
    private int rollno;
    private String name;

    public void setName(String name) {
        System.out.println("Alert : The value of string has been modified !!!!");
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    
    public String getName() {
        return name;
    }

    public int getRollno() {
        System.out.println("Alert : The value of rollno has been accessed unathorizedly !!!!");
        return rollno;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
             Student s = new Student();
             
             s.setName("Ajay");
             s.setRollno(69); 
             System.out.println(s.getRollno());
             System.out.println(s.getName());
    }
    
}
