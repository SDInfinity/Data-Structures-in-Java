public class passByReference {

    public static void update(int marks[],int nonchangeable)
    {
        for(int i=0;i<marks.length;i++)
        {
            nonchangeable=10;
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String [] args)
    {
        int nonchangeable=5;
        int marks[]={97,98,99};
        update(marks,nonchangeable);                                //so the changed values get reflected here
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println(" ");
        System.out.println(nonchangeable);                          //gets passed by value hence value remains same
    }

}
