public class SearchElem {

    public static void main(String[] args) {
        int a[][]={{10,20,30,40,50},{55,67,78,88,89},{90,94,96,100,101},{105,110,120,130,141}};
        int key=99;

        boolean flag=ispresent(a, key);
    }

    public static boolean ispresent(int a[][],int k)
    {
        int col=a.length-1;
        int row=0;
        while(row<=col)
        {
           if(a[row][col]==k)
           {
            System.out.println("Key is Present at ("+row+","+col+") ");
            return true;
           }
           else if(k>a[row][col])
           {
              row++;
           }
           else
           {
             col--;
           }
        }
        System.out.println("Key Not Found!!");
        return false;
    }
}