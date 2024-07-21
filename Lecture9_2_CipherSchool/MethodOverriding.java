
public class MethodOverriding {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.fun();
    }
}


class Parent{
     void fun(){//overridden method
        System.out.println("Hi, I am in Parent");
    }
}

class Child extends Parent{
     void fun(){//overriding method
        // super.fun();
        System.out.println("HI, I am in Child");
    }
}
