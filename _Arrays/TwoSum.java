import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int target;
        System.out.println("Enter the target");
        target=sc.nextInt();
        int array[]=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter array["+i+"]");
            array[i]=sc.nextInt();
        }
        int i=0;
        boolean found=false;
        List<Integer> list=new ArrayList<>();
        while(i<n-1)
        {
            int j=i+1;
            while(j<n)
            {
                int sum=array[i]+array[j];
                if(sum==target)
                {
                    list.add(i);
                    list.add(j);
                    found=true;
                }
                j++;
            }
            if(found)
            {
                break;
            }
            i++;
            if(i==n-1)
              break;
        }
        
        System.err.println(list);
    }
}
