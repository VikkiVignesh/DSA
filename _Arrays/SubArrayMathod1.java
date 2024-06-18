public class SubArrayMathod1 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        print_subarr(a);
    }

    public static void print_subarr(int a[])
    {
        int ts=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays is "+ts);
    }
}