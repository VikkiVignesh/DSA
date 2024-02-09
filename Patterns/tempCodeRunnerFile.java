 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows (in terms 2*r) :");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }