package Backtracking;

public class TrackArr {
    public static void main(String[] args) {
        int arr[]=new int[5];
        printArra(arr);
        backtrackArr(arr, 0, 1);
        printArra(arr);
    }

    public static void backtrackArr(int arr[],int ind,int value)
    {
        if(ind==arr.length)
        {
            printArra(arr);
            return;
        }

        arr[ind]=value;
        backtrackArr(arr, ind+1, value+1);
        arr[ind]=arr[ind]-2;
    }
    public static void printArra(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
