package Oops;

public class Polymorphism {
    public static void main(String[] args) {
         Animal anim=new Animal();
         anim.eat();
         anim.sound();

         Snake sn=new Snake();
         sn.eat();
         sn.sound();

         Cat cat=new Cat();
         cat.eat();
         cat.sound();

         Dog dg=new Dog();
         dg.eat();
         dg.sound();
    }
}

class Animal
{
    void eat()
    {
        System.out.println("Animal Eating");
    }

    void sound()
    {
        System.out.println("Animal Sounding");
    }
}

class Cat extends Animal
{
    void eat()
    {
        System.out.println("Cat Eating");
    }
    void sound()
    {
        System.out.println("Meow Meow!!");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog Eating");
    }
    void sound()
    {
        System.out.println("Bark Bark!!");
    }
}


class Snake extends Animal
{
    void eat()
    {
        System.out.println("snake Eating");
    }
    void sound()
    {
        System.out.println("buss buss!!");
    }
}