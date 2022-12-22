public class evenOdd {
    public static void main(String [] args)
    {
        int n=1001,bitMask=1;
        if((n&bitMask)==0)
        {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
