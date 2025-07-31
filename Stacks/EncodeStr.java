package Stacks;

import java.util.Stack;

public class EncodeStr {
    public static String decode(String s)
    {
        Stack<Integer> si=new Stack<>();
        Stack<Character> sc=new Stack<>();
        int num=0;

        
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(Character.isDigit(curr))
            {
                num=num*10+ curr-'0';
            }
            else if(Character.isSpaceChar(curr))
            {
                continue;
            }
            else if(curr=='[')
            {
                si.push(num);
                sc.push(curr);
                num=0;
            }
            else if (curr==']') {
                 StringBuilder pat=new StringBuilder();
                 while (!sc.isEmpty() && sc.peek()!='[') {
                    pat.insert(0, sc.pop());
                 }
                 sc.pop();
                 int rep=si.pop();
                 String patstr=pat.toString().repeat(rep);

                 for(char c: patstr.toCharArray())
                 {
                    sc.push(c);
                 }
            }
            else
            {
                sc.push(curr);
            }
            

        }

        StringBuilder res=new StringBuilder();
        while (!sc.isEmpty()) {
            res.insert(0, sc.pop());
        }
        return res.toString();
    }

    public static void add_to_Stack(Stack<Character> sc,String str,int rep)
    {
        if(rep!=0)
        {
            for(int i=0;i<str.length();i++)
            {
              sc.push(str.charAt(i));
            }
        }
        
    }
    public static void main(String[] args) {
        String s1="vi2[k]i";
        System.out.println(decode(s1));
    }
}
