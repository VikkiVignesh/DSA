package Strings;

import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sequence of Characters");
        String str=sc.nextLine();
        System.out.println("Compressed String is "+ getComp(str));
    }
    public static String getComp(String s)
    {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            Integer cnt=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
                i++;
            }
            res.append(s.charAt(i));
            res.append(cnt);
        }
        return res.toString();
    }
}
