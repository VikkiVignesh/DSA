package Recursion;

public class PairFriends {
  public static void main(String[] args) {
    System.out.println(pairs(3));
  } 
  
  public static int pairs(int n)
  {
    if(n==1 || n==2)
     return n;

    return pairs(n-1)+pairs(n-2)*(n-1);
  }
}
