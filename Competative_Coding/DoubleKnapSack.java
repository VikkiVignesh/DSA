package Competative_Coding;

public class DoubleKnapSack {

    public static int placeItem(int curr,int end,int sack[],int c1,int c2)
    {
        if(curr>=end)
        {
            return 0;
        }
        int res=placeItem(curr+1, end, sack, c1, c2);
        if(c1>=res)
        {
            int place1=sack[curr]+placeItem(curr+1, end, sack, c1-sack[curr], c2);
            res=Math.max(res, place1);
        }
        
        if(c2>=res)
        {
            int place2=sack[curr]+placeItem(curr+1, end, sack, c1, c2-sack[curr]);
            res=Math.max(res, place2);
        }
        return res;
    }

    public static int maxItem(int sack[],int c1,int c2)
    {
        int n=sack.length;
        return placeItem(0,n,sack,c1,c2);
    }
    public static void main(String[] args) {
        int KanpSack[]={8,5,3};
        int cap1=10;
        int cap2=3;

        System.out.println("Max Profit : "+ maxItem(KanpSack, cap1, cap2));
    }
}
