public class kadanesAlgo {                                   //O(n)😀
    public static void kadanesalgo(int numbers[])
    {
        int sum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            sum=sum+numbers[i];
            if(sum<0)                        //when sum is negative make current sum 0.
            {
                sum=0;
            }
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        System.out.println("The maximum subarray sum is: "+maxsum);
    }
    public static void main(String [] args)
        {
            int numbers[]={1,-2,6,-1,3};
            kadanesalgo(numbers);
        }
}
