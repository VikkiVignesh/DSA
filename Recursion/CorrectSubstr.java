package Recursion;

public class CorrectSubstr {
    public static void main(String[] args) {
        String str="abcab";
        System.out.println(getsubstring(str, 0,str.length()-1,str.length()));
    }
    public static int getsubstring(String s,int i,int j,int len)
    {
        if(len<=0)
         return 0;
        if(len==1)
         return 1;
        
         int res=getsubstring(s, i+1, j, len-1)+getsubstring(s, i, j-1, len-1)+getsubstring(s, i+1, j-1, len-2);
         if(s.charAt(i)==s.charAt(j))
         {
            res++;
         }
         return res;
    }
}
