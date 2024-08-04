public class OddEven
{
    public static void main(String[] args) {
        check(2);
        check(0);
        check(35);
        check(79);
        check(80);

        System.out.println(getBit(15, 2));
        System.out.println(getBit(15, 4));
        System.out.println(setBit(10, 0));
        System.out.println(clearBit(10, 3));
        System.out.println(updateBit(19, 3, 1));  // 10011 =>11011 27

        System.out.println(clearBit(15, 2));
        System.out.println(clearRangeBits(23, 2, 4));
        System.out.println(numBits(8));
        System.out.println(numBits(7));
    }

    public static int numBits(int n)
    {
        int cnt=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }
    public static int updateBit(int n,int i,int newBit)
    {
        if(newBit==0)
        {
            return clearBit(n, i);
        }
        else{
            return setBit(n,i);
        }

        /*
         * int n=clearBit(n,i);
         * int mask=newBit<<i;
         * return n|mask;
         */
    }

    public static boolean checkPowerof2(int n)
    {
        return (n&(n-1))==0;
    }


    public static int clearRangeBits(int n,int i,int j)
    {                      // n=23 i=2 i=4  16 8 4 2 1           10111
        int a=(~0)<<(j+1); // 000000<<2     11100(2)  01110 00111 00011
        int b=(1<<i)-1;   //
        int mask=a|b;  //                                     00011
        return n&mask;
    }

    public static int clearLastBits(int n,int i)
    {
        int mask=(~0)<<i;
        return n&mask;
    }
    public static int clearBit(int n,int i)  // 1010 i=2   res=>0010
    {                 
        int mask= ~(1<<i);   // 1<<3=>1000   ~1<<3 => 0111   1010
        return n&mask;      //                               0111
        //                                    AND operation  0010    
    }

    public static int setBit(int n,int i)
    {                   //1010
        int mask=1<<i;  //0001 
        return n|mask; // 1011 10->11
    }

    public static int getBit(int n,int i)
    {
        int mask=1<<i;  // n=10 1010  1<<2=> 0100  1010  || i=1 1<<1=> 0010  1010
        if((n&mask) ==0)//                         0100                      0010
        {               //                         0000                      0010  here anser !=0 so it will execute else part
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void check(int n)
    {
        int mask=1;
        if((n & mask) == 0)  // n=1010 for 10 n=10 for 2 we can observe that even numbers lsb is 0 and ;sb 1 for odd 
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}