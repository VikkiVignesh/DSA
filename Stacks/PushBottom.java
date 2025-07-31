package Stacks;

import java.util.Stack;

public class PushBottom {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //printStack(st);
        pushBtm(st, 5);
        System.out.println("After adding at the bottom..");
        printStack(st);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
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
