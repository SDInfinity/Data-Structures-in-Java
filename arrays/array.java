import java.util.*;
public class array {
    public static void main(String [] args)
    {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks ");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }
        int average=(marks[0]+marks[1]+marks[2])/3;
        for(int i=0;i<5;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println("\nThe average of first 3 marks is: "+average);
        sc.close();
    }
}
