public class merge_sort_string {
    public static void merge(String s[],int low ,int mid,int high)
    {
        //temp array
        String b[]=new String[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high)
        {
            if(s[i].compareToIgnoreCase(s[j])<0){
                b[k]=s[i];
                i++;k++;
            }else{
                b[k]=s[j];
                k++;j++;
            }
        }
        //remaining strings
        while(i<=mid){
            b[k]=s[i];
            i++;k++;
        }
        while(j<=high)
        {
            b[k]=s[j];
            j++;k++;
        }
        //copy into original array
        for(k=0,i=low;k<b.length;k++,i++)
        {
            s[i]=b[k];
        }
    }
    public static void sort(String s[],int low,int high)
    {
        int mid=low+(high-low)/2;
        if(low<high){
            sort(s,low,mid);
            sort(s,mid+1,high);
            merge(s,low,mid,high);
        }else{
            return;
        }
    }
    public static void main(String [] args)
    {
        String s[]={"sun", "earth", "mars", "mercury"};
        sort(s,0,s.length-1);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
