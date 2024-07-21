
package Lecture7_CipherSchool;
public class ControlFlow {

    public static int findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Prince";
        st.marks = 40;
        System.out.println(st.name + "\n" + st.checkPass());

        Student st1 = new Student();
        st1.name = "Raj";
        st1.marks = 50;
        System.out.println(st1.name + "\n" + st1.checkPass());

        System.out.println(findMax(2, 5, 10));
        // Scanner sc = new Scanner(System.in);
        char ch = 'a';
        switch (ch) {
            case 'a':
                System.out.println("Hi, I'm A");
                break;
            case 'b':
                System.out.println("Hi, I'm B");
                break;
            case 'c':
                System.out.println("Hi, I'm C");
                break;
            default:
                System.out.println("I'm not A, B or C");
                break;
        }

    }
}

class Student {
    String name;
    int marks;

    boolean checkPass() {
        if (marks > 40) {
            return true;
        }
        // else{
        // return false;
        // }
        return false;
    }
}