abstract class Car{
    int maxSpeed;
    abstract void acclerate();
    abstract void brake();
}

abstract class BMW extends Car{
    void acclerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brakes");
    }
}
abstract class A{//an abstract class can exits without abstract methods
    //we simply mean we will not be able to create object of this class
    int x = 10;
    void fun(){
        System.out.println("Hello, I am A");
    }
}
class B extends A{
    public void call(){
        super.fun();
    }
}

public class AbstractStudy {
    public static void main(String[] args) {
        // BMW obj = new BMW();
        // obj.acclerate();
        BMW2 b = new BMW2();
        b.acclerate();
        b.brake();
        B b1 = new B();
        b1.call();

    }
}