public class grid_ways {
    public static int totalWays(int n ,int m,int x,int y ){
        if(x==m-1 && y==n-1)
        {
            return 1;               //1 way when present at target
        }
        else if(x==m || y==n)       //boundary won't go any further
        {
            return 0;
        }
        //each level 2 choices either go down or go right
        return totalWays(n, m, x+1, y)+totalWays(n, m, x, y+1);
    }
    public static void main(String [] args)
    {
        int rows=3,columns=3;
        System.out.println("The total number of ways are "+totalWays(rows,columns,0,0)+".");
    }
}
