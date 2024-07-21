class A{
    final int noOfAplhabets = 26;//final varibale- Value once assigned cannot be changed
    final int noOfDigits;
    //Either assign the value at time of declaration or assign the value inside constructor
    A(){
        noOfDigits = 10;
    }
    final void fun(){
        System.out.println("Hi, I am function in class A");
    }
}
final class B extends A{//Final classes cannot be inherited
    // void fun(){
    //     System.out.println("I am function in B overriding function in A");
    // }
}
public class FinalStudy {
    public static void main(String[] args) {
        A obj = new A();
        obj.fun();
    }
}