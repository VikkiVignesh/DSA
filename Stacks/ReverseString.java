package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="Vicky";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }

        String res=reversestr(st);
        System.out.println(res);
    }

    public static String reversestr(Stack<Character> s)
    {
        StringBuilder res=new StringBuilder();
        while (!s.isEmpty()) {
            res.append(s.pop());
        }
        return res.toString();
    }
}
