import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int a=sc.nextInt();
        System.out.println("Enter another number :");
        int b=sc.nextInt();
        System.out.println("Before Swap ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swap ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
    
}
