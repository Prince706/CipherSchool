class demo{
    void fun(){
        System.out.println("I have no parameters");
    }
    void fun(int x){
        System.out.println("I have 1 parameter x: "+x);
    }
    void fun(String s){
        System.out.println("I have 1 parameter s:"+s);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameter a & b: "+a+ ","+b);
    }
}


public class MethodOverload {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.fun();
        obj.fun(2);
        obj.fun("raj");
        obj.fun(5, 10);

        //best example of overloading is println() or print()
        System.out.println(5);
        System.out.println("abc");
        System.out.println(7.52);
    }
}