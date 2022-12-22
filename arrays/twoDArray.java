import java.util.*;
public class twoDArray {
    public static void main(String [] args)
    {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(max<matrix[i][j])
                {
                    max=matrix[i][j];
                }
                if(min>matrix[i][j])
                {
                    min=matrix[i][j];
                }

            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Largest element in matrix : "+max+" and smallest element is: "+min);
        sc.close();
    }
}
