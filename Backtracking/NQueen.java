public class NQueen {
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]='.';
            }
        }
        //placeQueensAllways(board,0);
        placeQueens(board,0);
        System.out.println("Total ways of place "+n+" Queens is : "+count);
        if(FirstQueensplacement(board,0))
        {
            System.out.println("First Possible arrangment");
        }
        else{
            System.out.println("Arrangement not possible.");
        }
    }

    public static boolean isSafe(char board[][],int row,int col)
    {
        //vertical 
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
               return false;
            }
        }

        //diagonal
        for(int i=row-1 , j=col-1;i>=0 && j>=0;i--,j-- )
        {
            if(board[i][j]=='Q')
             return false;
        }
        //right side

        for(int i=row-1 ,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
             return false;
        }
        return true;
    }

    
    public static void placeQueensAllways(char brd[][],int row)
    {
        if(row==brd.length)
        {
            printBoard(brd);
            return;
        }

        for(int j=0;j<brd.length;j++)
        {
            brd[row][j]='Q';
            placeQueensAllways(brd, row+1);
            brd[row][j]='.';
        }
    }
    public static void placeQueens(char brd[][],int row)
    {
        if(row==brd.length)
        {
            printBoard(brd);
            count++;
            return;
        }

        for(int j=0;j<brd.length;j++)
        {
            if(isSafe(brd, row, j))
            {
                brd[row][j]='Q';
            placeQueens(brd, row+1);
            brd[row][j]='.';
            }
          
        }
    }



    public static boolean FirstQueensplacement(char brd[][],int row)
    {
        if(row==brd.length)
        {
            printBoard(brd);
            return true;
        }

        for(int j=0;j<brd.length;j++)
        {
            if(isSafe(brd, row, j))
            {
                brd[row][j]='Q';
            if(FirstQueensplacement(brd, row+1))
            {
                return true;
            }
            brd[row][j]='.';
            }
          
        }
        return false;
    }

   
    public static void printBoard(char arr[][])
    {
        System.out.println("-----Board------");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
