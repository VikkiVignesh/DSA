package Oops;

public class OverRiding {
    public static void main(String[] args) {
        first f1=new first();
        second s1= new second();
        third t1=new third();
        f1.display();
        s1.display();
        t1.display();
    }
}

class first
{
    void display()
    {
        System.out.println("Method called from class first");
    }
}


class second extends first
{
    void display()
    {
        System.out.println("Method called from class second");
    }
}

class third extends second
{
    void display()
    {
        System.out.println("Method called from class third");
    }
}