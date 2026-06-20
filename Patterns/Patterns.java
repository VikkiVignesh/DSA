//Square Pattern
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    System.out.print("*");
}
System.out.println();
}


//Right Angle Triangle Pattern
for(int i=0;i<n;i++)
{
    for(int j=0;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}

//Number Triangle Pattern
 for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
}


int num=1;
for(int i=0;i<n;i++)
{
    for(int j=0;j<=i;j++)
    {
        System.out.print(num);
    }
    num++;
    System.out.println();
}
    

//Inverted Right Angle Triangle Pattern
for(int i=n;i>=0;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}


//Inverted Number Triangle Pattern
for(int i=n;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
}


//Pyramid Pattern
for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i)-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }


//Inverted Pyramid Pattern
for(int i=n;i>=1;i--)
{
for(int k=1;k<=n-i;k++)
{
    System.out.print(" ")
}
for(int j=1;j<=(2*i)-1;j++)
{
    System.out.print("*");
}
System.out.println();
}
    
    

//Diamond Pattern
for(int i=1;i<=n;i++)
     {
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
     for(int i=n;i>=1;i--)
     {
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
     } 



//Half Diamond Pattern
for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
     }

      for(int i=n-1;i>=1;i--)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
     }




//Crown Number Pattern
 for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }

        for(int k=1;k<=2*(n-i);k++)
        {
            System.out.print(" ");
        }

        for(int l=i;l>=1;l--)
        {
            System.out.print(l);
        }
        System.out.println();
    }


//Character Pattern T\Right Angle Triangle
for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)('A'+j));
        }
        System.out.println();
    }



//inverted triangle
 for(int i=n;i>=0;i--)
{
    for(int j=0;j<i;j++)
    {
        System.out.print((char)('A'+j));
    }
    System.out.println();
}


//Alphabet Pyramid Pattern
for(int i=0;i<n;i++)
      {
        for(int j=0;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++)
        {
            System.out.print((char)('A'+k));
        }

        for(int l=i-1;l>=0;l--)
        {
            System.out.print((char)('A'+l));
        }

        System.out.println();
      }




// Decereasing Triang;e pattern
int n=4;
       char c=(char) ('A' + (n - 1));
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
          System.out.print((char)(c+j));
        }
        c--;
        System.out.println();
    }



//Hallow patterns
for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
         for (int i = n-1; i >=0; i--) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


//Butterfly Patternfor(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++)
        {
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n-1;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int k=1;k<2*(n-i);k++)
        {
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }


    //Hallow Square Pattern
     for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==1 || j==1 || j==n || i==n)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


//Nummber circular pattern
 int size=(2*n)-1;
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            int top=i;
            int left=j;
            int bottom=size-1-i;
            int right=size-1-j;
            int mindist=Math.min(Math.min(top,bottom),Math.min(left,right));
            System.out.print(n-mindist);
        }
        System.out.println();
    }