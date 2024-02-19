import java.util.*;
public class SprialTraversal {
    public static void main(String[] args) {
        int arr[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        display(arr);
        
    }
    static void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sprialtravrse(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            
        }
    }
}
