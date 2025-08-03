package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepChar {

    public static void getUniqueChar(String s)
    {
        Queue<Character> q=new LinkedList<>();
        int alpha[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            q.add(curr);
            alpha[curr-'a']++;

             while ( !q.isEmpty() &&alpha[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.print(-1+" ");
            }
            else
            {
                System.out.print(q.peek()+" ");
            }
           
        }
        System.out.println();

        System.out.println("At the End");

        while ( !q.isEmpty() &&alpha[q.peek()-'a']>1) {
                q.remove();
            }
        System.out.println(q.peek());

    }
    public static void main(String[] args) {
        String str="aabccxb";
        getUniqueChar(str);
    }
}
