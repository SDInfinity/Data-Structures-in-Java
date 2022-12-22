public class largest {
    public static int getlargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;             //-infinity
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i])                //if largest is less than than the current array value.
            {
                largest=numbers[i];               //then assign largest to that value and continue the same.
            }                                     //similar for smallest
        }
        return largest;
    }
    public static void main(String [] args)
    {
        int numbers[]={1,-2,-3,-4,-5,6};
        System.out.println("The largest number of the array is: "+getlargest(numbers));
    }
}
