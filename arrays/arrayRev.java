public class arrayRev {
    public static void reverse(int numbers[])
    {
        int start=0,end=(numbers.length)-1;                   //constant space is being taken up
        while(start<end)
        {
            int temp;
            temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args)
    {
        int numbers[]={1,2,3,4,5};
        reverse(numbers);
        System.out.println("The reversed array is ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }
}
