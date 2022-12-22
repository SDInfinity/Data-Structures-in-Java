public class recurring {
    public static void printRecurringIndex(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return;
        }
        if(a[i]==key){
            System.out.print(i+" ");
        }
        printRecurringIndex(a, i+1, key);
    }
    public static void main(String [] args)
    {
        int a[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        printRecurringIndex(a, 0, 2);
    }
}
