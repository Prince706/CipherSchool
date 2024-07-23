package Lecture13_CipherSchool;

class Demo{
    private int a = 5;
    private int b = 25;
    private int c = 45;//read only
    private int d = 50;


    public int getA(){//getter
        System.out.println("Value of A read");
        return this.a;
    }

    public int getB(){
        System.out.println("Value of B read");
        return this.b;
    }

    public void setA(int a){//setter
        if (a > 100) {
            this.a = a;
            System.out.println("value of A changed to: "+a);
        }
        else{
            System.out.println("Cannot set - Value outside limits");
        }
    }

    public void setB(int b){
        this.b = b;
    }

    // public void setC(int c){
    //     this.c = c;
    // }

    public int getC(){//only getter of C -> READ ONLY
        System.out.println("Value of C read");
        return this.c;
    }

    public void setD(int d){//setter only -> write only
        this.d = d;
    }

    // public int getD(){
    //     System.out.println("Value of D read");
    //     return this.d;
    // }
}


public class EncapsulationStudy {
    public static void main(String[] args) {
        Demo d = new Demo();
        // System.out.println(d.a);//not visible beacuse private
        System.out.println(d.getA());
        d.setA(33);
        System.out.println(d.getA());
        d.setB(44);
        System.out.println(d.getB());
    }
}