
public class Operator {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("X is:" + x);
        System.out.println("Y is: "+ y);

        byte b = 10;
        System.out.println("B is: "+ b);
        
        byte b2 = 120;
        System.out.println("B2 is: "+b2);

        int i = 45;
        System.out.println("I is: "+i);

        byte b3 = (byte)256;//Explicit Type Casting or Narrowing
        System.out.println("B3 is: "+b3);

        int n = b;//Implicit Type Casting or widening 
        System.out.println("N is: "+n);

        float f = (float)5.2;//by default considers decimal to be double
        float f2 = 5.5f;
        
        double d = 10.5;
        char ch = 'a';
        System.out.println(ch);

        //Task 1: Different ways to convert character to int

        int z = x + y;
        //+ -> operator
        //x,y -> operands

        //Increment & Decrement Operator
        int m = 5;
        int n2 = m++;
        System.out.println("M: "+m+ " " + "N2: "+n2);
    }
}