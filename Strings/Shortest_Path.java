package Strings;

import java.util.Scanner;

public class Shortest_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the direction in form of string");
        String direction=sc.nextLine();

        System.out.println("Shortest path to reach destination from origin  is "+getpath(direction));
    }

    public static int getpath(String s)
    {
        s=s.toUpperCase();
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                y+=1;
            }
            if(s.charAt(i)=='E')
            {
                x+=1;
            }
            if(s.charAt(i)=='S')
            {
                y-=1;
            }
            if(s.charAt(i)=='W')
            {
                x-=1;
            }
        }

        return find_dist(x,y);
    }
    public static int find_dist(int a,int b)
    {
        return (int)Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
    }
}
