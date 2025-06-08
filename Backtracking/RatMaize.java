public class RatMaize {
    static int cnt=0;

    public static void printMaze(int farm[][])
    {
        for(int i=0;i<farm.length;i++)
        {
            for(int j=0;j<farm.length;j++)
            {
                System.out.print(farm[i][j]+" ");
            }
            System.out.println();
        }
    }
   
    public static boolean isSafe(int maze[][],int x,int y)
    {
        //System.out.println("Condition check :"+(cnt++));
        return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }

    public static boolean solveMaze(int maze[][])
    {
        int N=maze.length;
        int sol[][]=new int[N][N];
        if(FindPath(maze, 0, 0,sol)==false)
        {
          System.out.println("Solution not Exists..");
          return false;
        }
        printMaze(sol);
        return true;
    }


    public static boolean FindPath(int maze[][],int x,int y,int sol[][])
    {
        if(x== maze.length-1 && y==maze.length-1 && maze[x][y]==1 )
        {
            sol[x][y]=1;
            return true;
        }


        if(isSafe(maze, x, y)==true)
        {
            if(sol[x][y]==1)
            {
                return false;
            }
           sol[x][y]=1;
           
           if(FindPath(maze, x, y+1, sol))
             return true;
           if(FindPath(maze, x+1, y, sol))
             return true;
           //sol[x][y]=0;
           return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0},
    {1,1,0,1},{0,1,0,0},{1,1,1,1}};

    solveMaze(maze);
    }
}
