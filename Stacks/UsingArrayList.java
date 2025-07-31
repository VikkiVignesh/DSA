package Stacks;

import java.util.ArrayList;

public class UsingArrayList {
    static class Stack
    {
        static ArrayList<Integer> list=new ArrayList<>();

        public void push(int x)
        {
            list.add(x);
            System.out.println(x+" Added to teh list !!");
        }

        public void pop()
        {
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            //System.out.println(top+" Roemoved from teh list..");
        }

        public boolean isEmpty()
        {
            return list.size()==0;
        }

        public int peek()
        {
            return list.get(list.size()-1);
        }
        
    }
    public static void main(String[] args) {
        
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

    }
}
