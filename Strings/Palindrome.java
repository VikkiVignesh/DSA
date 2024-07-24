package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println("Is "+str+" Palindrome ? : "+isPalindrome(str));
    }

    public static boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
