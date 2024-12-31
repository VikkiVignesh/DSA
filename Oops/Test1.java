package Oops;

public class Test1 {
    public static void main(String[] args) {
        new BlueCar();
    }
}

class Car
{
    static
    {
        System.out.println("1");
    }

    public Car(String str)
    {
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}

class BlueCar extends Car
{
    {
        System.out.println("4");
    }
    public BlueCar()
    {
        super("blue");
        System.out.println(5);
    }
}
