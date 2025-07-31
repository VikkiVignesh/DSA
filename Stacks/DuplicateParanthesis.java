package Stacks;

import java.util.Stack;


public class DuplicateParanthesis {

    public static boolean checkdup_Bracket(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            if(curr==')')
            {
                int cnt=0;
                while(s.peek()!='(')
                {
                   s.pop();
                   cnt++;                    
                }
                if(cnt<1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
            }
            else
            {
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str1="(((a+b))*(c-d))";

        if(checkdup_Bracket(str1))
        {
            System.out.println("Contains Duplicate Brackets");
        }
        else
        {
            System.out.println("Contains valid Brackets");
        }
    }
}
