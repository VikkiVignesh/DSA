package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  String 1");
        String str1=sc.nextLine();
        System.out.println("Enter  String 2");
        String str2=sc.nextLine();
       if(str1.length()!=str2.length())
       {
        System.out.println("Invalid Strings");
        }
       else{
        System.out.println("Strings are in Anagram Form : "+isAnagram(str1, str2));
       }
    }

    public static boolean isAnagram(String s1,String s2)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            //if(map.containsKey(Character.valueOf(s.charAt(i)))
            if(map.containsKey(s1.charAt(i)))
            {
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else
            {
                map.put(s1.charAt(i), 1);
            }
        }
  
        for(int i=0;i<s2.length();i++)
        {
            map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if((Integer)entry.getValue()>0)
              return false;
        }
      return true;
    }
}
