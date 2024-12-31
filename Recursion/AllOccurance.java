package Recursion;

public class AllOccurance {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        displayoccurance(arr,2,0);
    }

    public static void displayoccurance(int a[],int k,int idx)
    {
        if(idx==a.length){
          //System.out.println(-1);
          return;
        }

        if(a[idx]==k)
        {
            System.out.println(idx);
        }
        displayoccurance(a, k, idx+1);
    }
}
