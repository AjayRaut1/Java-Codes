package teluskoyt;

class Student {

    int id;
    int roll_no;

    public void display() {
        System.out.println(this.id + " , " + this.roll_no);
    }
}

public class array {

    public static void main(String arg[]) {
        int a[] = {12, 23, 34, 45, 456};

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int b[] = new int[4];
        b[0] = 1343;
        System.out.println(b[0]);

        Student s1 = new Student();
        s1.id = 21;
        s1.roll_no = 3;
        s1.display();

        Student ss[] = new Student[4];

        //2D array
        int c[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {2, 2, 3, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Jagged array
        int d[][] = {
            {11, 22, 33, 44},
            {25, 33, 42, 23, 43, 234, 2345, 2},
            {47}
        };

        for (int i = 0; i < d.length; i++) {                //d.length give the total no. of rows
            for (int j = 0; j < d[i].length; j++) {         //d[i].length give the length of the specific row
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Enhanced for loop for 1D array
        for (int k : a) {
            System.out.print(k + " ");
        }

        System.out.println("\n");
        //Enhanced for loop for 2D array
        for (int k[] : d) {
            for (int l : k) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
