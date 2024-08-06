public class Upper_lower {
    public static void main(String[] args) {
        for(char c='A';c<='Z';c++)
        {
            System.out.print((char)(c|' ')+" ");
        }
       System.out.println();

        //-x=~x+1
        //-~x=x+1
        int x=8;
        System.out.println(~x);
        System.out.println(-~x);
        x=-6;
        System.out.println(~x);
        System.out.println(-~x);
    }
}
