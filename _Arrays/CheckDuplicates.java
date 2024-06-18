public class CheckDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,1,2,3,5,5};
        System.out.println(checkdup(a));
        System.out.println(checkdup(b));
        display(a);
        display(b);
    }
    public static boolean checkdup(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
         for(int j=i+1;j<a.length;j++)
         {
            if(a[i]==a[j])
             return true;
         }
        }
        return false;
    }

    public static void display(int a[])
    {
        System.out.println("Printing Duplicates");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
