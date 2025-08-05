package Greedy_Algo;

import java.util.Arrays;

public class MinAbsolutePair {
    public static void main(String[] args) {
        int arr1[]={4,1,8,7};
        int arr2[]={2,3,6,5};

        int minSum=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++)
        {
            minSum+=Math.abs(arr1[i]-arr2[i]);
        }

        System.out.println("Min Absolute pairs Sum is : "+minSum);
    }
}
