package Backtracking;

public class SubsetStr {
 
    public static void main(String[] args) {
        String str="abc";
        strSubset(str,"", 0);
    }

    public static void strSubset(String str,String ans,int ind)
    {
      if(ind==str.length())
      {
        if(ans.length()==0)
        {
            System.out.println("Null");
        }
        else
        {
            System.out.println(ans);
        }
        return;
      }
      strSubset(str, ans+str.charAt(ind), ind+1);
      strSubset(str, ans, ind+1);
    }
}
