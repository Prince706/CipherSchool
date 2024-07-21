
public class LoopStudy {
    public static void main(String[] args) {
        // System.out.println(1);
        // System.out.println(2);
        
        int i = 1;
        for ( i = 0; i <=100; i++) {
            System.out.println(i);
        }
        
        System.out.println(i + " is the value of i after the loop.");
        System.out.println("***************************************");
        for (i = 0; i < 100; i++) {
            System.out.println("i is: "+i);
        }

        //While Loop
        int n = 5;
        while (n > 0) {
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop n is: "+n);

        //Do While Loop
        n = 5;
        do {
            System.out.println(n);
            n--;
        } while (n>0);


        
        //While Loop
        n = 0;
        while (n > 0) {
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop n is: "+n);

        //Do While Loop- runs once
        n = 0;
        do {
            System.out.println(n);
            n--;
        } while (n>0);

    }
}
