package Recursion;

public class TowerofHanoi {
    public static void main(String[] args) {
        arrangeDisk(4, "A","B","C");
    }

    public static void arrangeDisk(int n, String src,String dest,String helper)
    {
        if(n==1)
        {
            System.out.println("Transform Disk "+n+" From "+src+" to "+dest);
            return;
        }

        arrangeDisk(n-1, src, dest, helper);
        System.out.println("Transform Disk "+n+" From "+src+" to "+helper);
        arrangeDisk(n-1, helper,src,dest);
    }
}
