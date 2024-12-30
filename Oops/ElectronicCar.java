package Oops;

public class ElectronicCar extends Car {

   
    public static void main(String[] args) {
        final Car car=new Car();
        System.out.println(car.drive());
    }
}
class Automobile
{
    protected String drive()
    {
        return "Driving vehicle";
    }
}

class Car extends Automobile
{
    private String drive()
    {
        return "Driving Car";
    }
}


