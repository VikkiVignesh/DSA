package Recursion;

public class Duplicates {
    public static void main(String[] args) {
        removedup("Free Fires", 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removedup(String str,int index,StringBuilder res,boolean map[])
    {
        if(index == str.length())
        {
            System.out.println(res);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar -'a']== true)
        {
            removedup(str, index+1, res, map);
        }
        else
        {
            map[currchar-'a']=true;
            removedup(str, index+1, res.append(currchar), map);
        }
    }
}
