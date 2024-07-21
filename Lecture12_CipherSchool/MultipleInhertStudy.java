package Lecture12_CipherSchool;
interface A {
    int x = 10;
    void fun();
}

interface B{
    int x = 20;//static and final
    void fun();
}
class C implements A ,B{//multiple inheritence in java
    public void fun() {
        System.out.println("Hello, I am function in C");
        System.out.println(B.x);
        System.out.println(B.super.hashCode());
    }
}
interface O extends A,B{
    void fun();
}
class D implements O{
    public void fun() {
        System.out.println("Hello, I am function in D");
    }
}

public class MultipleInhertStudy {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}