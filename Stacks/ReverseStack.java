package Stacks;

import java.util.Stack;


public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        revstack(st);
        
        System.out.println("Afetr Reversing Stack..");

        printStack(st);

    }
     public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void revstack(Stack<Integer> s) {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        revstack(s);
        pushBtm(s, top);
    }

     public static void pushBtm(Stack<Integer> s,int x)
    {
       if(s.isEmpty()){
        s.push(x);
        return;
       }
       int top=s.pop();
       pushBtm(s, x);
       s.push(top);
    }
}
