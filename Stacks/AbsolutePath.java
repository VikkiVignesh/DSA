package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AbsolutePath {

    public static String unix_path(String str)
    {
        String fpaths[]=str.split("/");
        Stack<String> s=new Stack<>();

        for(int i=0;i<fpaths.length;i++)
        {
            if( fpaths[i].equals("") ||fpaths[i].equals("."))
            {
                continue;
            }
            else if(fpaths[i].equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else
            {
                s.push(fpaths[i]);
            }
        }

        List<String> resultParts = new ArrayList<>(s);
        return "/" + String.join("/", resultParts);
    }
    public static void main(String[] args) {
        String str1="/vikki/v/f/../c/../n/./b";
        String str2="/vikki/v/.";
        String str3="/Vicky/../..";
        String str4="/Vikki/c/./v/m/../.";
        System.out.println(unix_path(str1));
        System.out.println(unix_path(str2));
        System.out.println(unix_path(str3));
        System.out.println(unix_path(str4));
    }
}
