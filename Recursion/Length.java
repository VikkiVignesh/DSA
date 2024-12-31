package Recursion;

public class Length {
 public static void main(String[] args) {
    System.out.println(leng("vikki"));
 }   
  public static int leng(String s) {
     if(s.length()==0)
      return 0;
     return leng(s.substring(1))+1;
  }
}
