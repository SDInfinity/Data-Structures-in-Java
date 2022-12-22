public class binSearch {
    public static int search(int numbers[],int key,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            else if(numbers[mid]>key)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        int numbers[]={1,2,3,4,5};
        int index=search(numbers, 3, 0, numbers.length-1);
        if(index==-1)
        {
            System.out.println("Not Found");
        }else 
        {
            System.out.println("Number found at index "+index);
        }
    }
}
