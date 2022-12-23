public class inversion_count {
    public static int merge(int a[],int left,int mid,int right){
        int inverseCount=0;
        int i=left,j=mid,k=0;
        int b[]=new int[right-left+1];
        while(i<mid && j<=right)
        {
            if(a[i]<=a[j]){
                b[k]=a[i];
                k++;i++;
            }else{
                b[k]=a[j];
                inverseCount+=mid-i;
                j++;k++;
            }
        }
        while(i<mid){
            b[k]=a[i];
            i++;k++;
        }
        while(j<=right){
            b[k]=a[j];
            k++;j++;
        }
        for(k=0,i=left;i<=right;i++,k++)
        {
            a[i]=b[k];
        }
        return inverseCount;
    }
    public static int sort(int a[], int left, int right) {
        int inverseCount=0;
        int mid = left + (right - left) / 2;
        if (left < right) {
            // calling for left subarray
            inverseCount=sort(a, left, mid);
            // calling for right subarray
            inverseCount+=sort(a, mid + 1, right);
            // finally merging the sorted arrays and also taking into the count for merging.
            inverseCount+=merge(a, left, mid+1, right);
        }
        return inverseCount;
    }
    public static void main(String[] args)
    {
        int a[]={8,4,2,1};
        System.out.println("The inversion count is : "+sort(a, 0, a.length-1));
    }
}    