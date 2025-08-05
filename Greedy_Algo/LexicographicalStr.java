package Greedy_Algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LexicographicalStr {
    public static String getstr(int N,int k)
    {
      char arr[]=new char[N];
      Arrays.fill(arr,'a');
      System.out.println(Arrays.toString(arr));
      for(int i=N-1;i>=0;i--)
      {
        k-=i;
        if(k>0)
        {
            if(k>26)
            {
                arr[i]='z';
                k-=26;
            }
            else
            {
                arr[i]=(char)(k+97-1);
                int sub=arr[i]-'a'+1;
                k-=sub;
            }
        }
        else
        {
            break;
        }
        k+=i;
      }

      StringBuilder str=new StringBuilder();
      for(int i=0;i<arr.length;i++)
      {
        str.append(arr[i]);
      }
      return str.toString();
    }
    public static void main(String[] args) {
        int strSize=5;
        int strsum=42;
        System.out.println(getstr(strSize, strsum));
    }   
}
