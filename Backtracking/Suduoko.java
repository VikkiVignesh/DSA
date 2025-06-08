public class Suduoko {
    public static boolean isDigitPlaced(int sudo[][],int row,int col,int digit)
    {
        for(int i=0;i<9;i++)
        {
            if(sudo[i][col]==digit)
            {
                return false;
            }
        }
        for(int i=0;i<9;i++)
        {
            if(sudo[row][i]==digit)
            {
                return false;
            }
        }

        //grid check

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudo[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findSudokosol(int sudoko[][],int row,int col)
    {
        if(row==9 && col==0)
        {
            return true;
        }
        int nextrow=row;
        int nextcol=col+1;

        if(col+1==9)
        {
            nextcol=0;
            nextrow=row+1;
        }

        if(sudoko[row][col]!=0)
        {
            return findSudokosol(sudoko, nextrow, nextcol);
        }
        for(int i=1;i<=9;i++)
        {
            if(isDigitPlaced(sudoko,row,col,i))
            {
                sudoko[row][col]=i;
                if(findSudokosol(sudoko, nextrow, nextcol))
                {
                    return true;
                }
                sudoko[row][col]=0;
            }
        }
        return false;
        
    }

    public static void printsudo(int suko[][])
    {
        for(int i=0;i<suko.length;i++)
        {
            for(int j=0;j<suko[i].length;j++)
            {
                System.out.print(suko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(findSudokosol(sudoko, 0, 0))
        {
            System.out.println("Solution exists");
            printsudo(sudoko);
        }
        else
        {
            System.out.println("Solution not found");
        }
    }
}
