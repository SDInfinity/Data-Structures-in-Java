public class add1 {
    public static int add(int n)
    {
        int sum=-(~n);
        return sum;
    }
    public static void main(String [] args){
        int n=10;
        System.out.println("The integer after adding 1 is : "+add(n));
    }
    
}
