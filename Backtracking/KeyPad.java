public class KeyPad {

    final static char [][] Btn={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void letterCombination(String D)
    {
        if(D.length()==0)
        {
            System.out.println(" ");
            return;
        }
    
        printcombination(D, new StringBuilder(), 0);
    }
    public static void printcombination(String D,StringBuilder res,int pos)
    {
        if(pos== D.length())
        {
            System.out.println(res);
        }
        else{
            char letters[]=Btn[Character.getNumericValue(D.charAt(pos))];
            for(int i=0;i<letters.length;i++)
            {
                printcombination(D, new StringBuilder(res).append(letters[i]), pos+1);
            }
        }
    }
    public static void main(String[] args) {
      
        letterCombination("23");
    }
}
