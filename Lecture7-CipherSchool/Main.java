public class Main{
    public static void main(String[] args) {
        Car polo = new Car();
        System.out.println(polo.name);
        System.out.println(polo.year);
        System.out.println(polo.color);
        System.out.println(polo.maxSpeed);

        polo.name = "Polo";
        polo.year = 1990;
        polo.color = "red";
        polo.maxSpeed = 60;

        System.out.println(polo.name);
        System.out.println(polo.year);
        System.out.println(polo.color);
        System.out.println(polo.maxSpeed);

    }
}

class Car {
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate(){
        System.out.println("Car is accelearting");
    }
}