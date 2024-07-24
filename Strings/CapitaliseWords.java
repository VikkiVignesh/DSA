package Strings;

import java.util.Scanner;

public class CapitaliseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Name : ");
        String str=sc.nextLine();
        System.out.println("Sentence in Capitalise form : "+convert(str));
    }
    public static String convert(String s)
    {
        StringBuilder str=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));
        str.append(ch);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && i<s.length()-1)
            {
              str.append(" ");
              i++;
              str.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
