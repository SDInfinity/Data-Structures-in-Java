public class prefixSum {                          //O(n^2)
    public static void prefixsum(int numbers[])
    {
        int prefixsum[]=new int[numbers.length],sum=0,maxsum=Integer.MIN_VALUE;
        //calculate prefix sum
        prefixsum[0]=numbers[0];
       for(int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                sum=(i==0)?prefixsum[j]:prefixsum[j]-prefixsum[i-1];   //sum for each individual sub array
                if(maxsum<sum){                                        //if maxsum is less than the current sub array sum then store it in maxsum.
                    maxsum=sum;
                }       
                System.out.print(sum+" ");            
            }
        }
        System.out.println(" ");
        System.out.println("Maximum subarray sum is: "+maxsum);
    }
    public static void main(String [] args)
        {
            int numbers[]={1,-2,6,-1,3};
            prefixsum(numbers);
        }
}
