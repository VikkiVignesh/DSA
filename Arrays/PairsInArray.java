public class PairsInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        print_pairs(arr);

    }
    public static void print_pairs(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("("+a[i]+","+a[j]+") ");
            }
            System.out.println();
        }
    }
}
