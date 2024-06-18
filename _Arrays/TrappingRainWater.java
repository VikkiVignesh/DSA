package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Rain Water Trapping Problem!!!");
        System.out.println("Enter the Number of Blocks");
        int n=sc.nextInt();
        System.out.println("Enter the walls Height ");
        int walls[]=new int[n];
        for(int i=0;i<n;i++)
        {
            walls[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(walls));

        System.out.println("Amount of Rain Water Trapped in the Walls is : "+findVolume(walls, getRightBound(walls),getLeftBound(walls)));
        System.out.println(getWater(walls));
    }

    public static int findVolume(int w[],int r[],int l[])
    {
        if(isAscending(w) || isDescending(w) || w.length<=2)
        { 
            System.out.println("Requirements Not Satisfied to Calculate..");
            return 0;
        }
        int max=0;
        for(int i=0;i<w.length;i++)
        {
            int qty=Math.min(r[i],l[i] )-w[i];
            max+=qty;
        }
        return max;
    }

    public static boolean isAscending(int a[])
    {
        boolean flag=true;
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]>a[i+1])
              flag=false;
        }
        return flag;
    }

    public static boolean isDescending(int a[])
    {
        boolean flag=true;
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]<a[i+1])
               flag=false;
        }
        return flag;
    }

    public static int[] getLeftBound(int a[])
    {
        int temp[]=new int[a.length];
        temp[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            temp[i]=Math.max(temp[i-1], a[i]);
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }
    public static int[] getRightBound(int a[])
    {
        int temp[]=new int[a.length];
        temp[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            temp[i]=Math.max(temp[i+1], a[i]);
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }




    public static int getWater(int a[])
    {
        int l=0,r=a.length-1; // 0,4  0,3 1,3 2,3
        int water=0; // 0,0  ,2, 4
        int left=a[l]; //6 ,6 ,4
        int right=a[r];  //5 ,8 
        while (l<r) { //0<4  0<3
            if(left<right) // 6<5  6<8 4<8
            {
                l++; // 1,2
                left=Math.max(left, a[l]);
                water+=left-a[l]; // 0+6-4  =2   2+=max(4,2)4-2 4
            }
            else
            {
                r--; // 3 
                right=Math.max(right,a[r]);
                water+=right-a[r]; //0+=8-8 0
            }
        }
        return water;
    }

}
