package Competative_Coding;

public class BaseConverstion {


    public static int val(char c)
    {
        if(c >='0' && c<='9')
        {
            return (int) c-'0';
        }
        else 
        {
            return (int) c-'A'+10;
        }
    }

    public static char reVal(int num)
    {
        if(num>=0 && num<=9)
        {
            return (char)(num +'0');
        }
        else
        {
            return (char)(num+'A'-10);
        }
    }


    public static int todecimal(String str,int base)
    {
        int power=1;
        int num=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
            num+=val(c)*power;
            power=power*base;
        }
        return num;
    }


    public static String toBase(int num,int base) {
        String res="";

        while (num>0) {
            res+=reVal(num %base);
            num/=base;
        }
        return rev(res);

    }

    public static String rev(String str)
    {
        char [] arr=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while (i<j) {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str="1011";
        System.out.println(todecimal("1A", 16));
        int num=todecimal(str, 2);
        System.out.println(toBase(96, 16));
    }
}
