public class countSetBits {
    public static int count(int n){       //O(log n)
        int freq=0;
        while(n>0)
        { 
            if((n & 1)!=0)               //check LSB
            {
                freq++;
            }
            n=n>>1;
        }
        return freq;
    }
    public static void main(String [] args )
    {
        int n=15;
        System.out.println("The number of set bits are : "+count(n));
    }
    
}
