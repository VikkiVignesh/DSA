//Subarray is a continuous part of an Array

public class PrintSubArray {
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSub(arr);
    }

    static void printSub(int a[])
    {
      for(int i=0;i<a.length-1;i++)
      {
        for(int j=i;j<a.length;j++)
        {
            for(int k=j-i;k<j;k++)
            {
                System.out.print(a[i]+", ");
            }
            System.out.println();
        }
      }
    }
}
