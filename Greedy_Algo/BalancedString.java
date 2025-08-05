package Greedy_Algo;

public class BalancedString {

    public static int getSubstrings(String s)
    {
        int l=0,r=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='L')
            {
                l++;
            }
            else if(c=='R')
            {
                r++;
            }
            if(l==r)
            {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        System.out.println("Max SubString frm the given string is : "+getSubstrings(str));
    }
}
