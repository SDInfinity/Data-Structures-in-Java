public class subArraySum {                               //O(n^3)
    public static void subarraysum(int numbers[])
       {
        int total=0,sum=0,maxsum=Integer.MIN_VALUE,minsum=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum=sum+numbers[k];
                    System.out.print(numbers[k]+" ");  
                }
                System.out.print("Sum: "+sum);
                if(maxsum<sum){                             //if maxsum is less than the current sub array sum then store it in maxsum.
                    maxsum=sum;
                }
                if(minsum>sum){                            
                    minsum=sum;
                }
                sum=0;                                       
                System.out.print("   ");
                total++;
            }
            System.out.println(" ");
        }
            System.out.println("Total Subarrays: "+total);
            System.out.println("Maximum subarray sum is: "+maxsum);
            System.out.println("Minimum subarray sum is: "+minsum);
    }
        public static void main(String [] args)
        {
            int numbers[]={1,-2,6,-1,3};
            subarraysum(numbers);
        }
    }
