package Lecture12_CipherSchool;
interface Shape {
    double pi = 3.14; // public, static, and final by default
    double getSquare(double r);//public and abstract
}

class Circle implements Shape {
    public double getSquare(double r) {
        return r * r ;
    }

    void fun() {
        System.out.println("I implemented an interface named Shape");
    }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}