package Lecture9_1_CipherSchool;
class Shape{
    double pi = 3.14;
    double getSquare(int r){
        return r*r;
    }
}

class Circle extends Shape{
    void area(int r){
        System.out.println(pi*getSquare(r));
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(5);
    }
    
}