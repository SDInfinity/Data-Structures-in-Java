public class powerOfTwo {
    public static boolean check(int n)
    {
        if((n&(n-1))==0)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args)
    {
        int n=16;
        if(check(n)){
            System.out.println("Power of Two");
        }else{
            System.out.println("Not a Power of Two");
        }
    }
}
