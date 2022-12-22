public class arrayPairs {
    public static void pairs(int numbers[])
    {
        int counter=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                counter++;
            }
            System.out.println(" "); 
        }
        System.out.println("Total pairs:"+counter);
    }
    public static void main(String [] args)
    {
        int numbers[]={2,4,6,8,10};
        pairs(numbers);
    }
}
