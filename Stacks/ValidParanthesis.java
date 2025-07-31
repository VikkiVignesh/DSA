package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean checkparathesis(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            if(curr=='(' || curr=='{' || curr=='[')
            {
                s.push(curr);
            }
            else
            {
                //closing brackets
               if(s.isEmpty())
               {
                return false;
               }
               if((curr==')' && s.peek()=='(') || (curr=='}' && s.peek()=='{')|| (curr==']' && s.peek()=='['))
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str="(([{({})}])";
        if(checkparathesis(str))
         System.out.println("Paranthesis "+str+" is Valid ");
        else
         System.out.println("Paranthesis "+str+" is not Valid ");
    }
}
