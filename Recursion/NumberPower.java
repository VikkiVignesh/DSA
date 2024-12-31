package Recursion;

public class NumberPower {
    public static void main(String[] args) {
        System.out.println(normalpower(2, 10));
        System.out.println(optimizedpower(2, 10));
    }

    public static int normalpower(int n,int exp)
    {
        if(exp==0)
          return 1;
        if(exp==1)
         return n;
        return n*normalpower(n, exp-1);
    }


    public static int optimizedpower(int n,int exp)
    {
        if(exp==0)
         return 1;
        int halfpower=optimizedpower(n, exp/2);
        int halfpowersq=halfpower*halfpower;

        if(exp%2!=0)
        {
         halfpowersq=n*halfpowersq;
        }
        return halfpowersq; 
    }
}
