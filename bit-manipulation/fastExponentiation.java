public class fastExponentiation {
    public static int fastExpo(int a,int n)     //O(log n)
    {
        int ans=1;
        while(n>0){
            if((n&1)!=0)
            {
                ans=ans*a;                     //if LSB is non-zero multiply by a each time
            }
            a=a*a;
            n=n>>1;                            //after every iteration right shift by one place
        }
        return ans;
     }
    public static void main(String [] args)
    {
        System.out.println("The answer is: "+fastExpo(3,5 ));
    }
}
