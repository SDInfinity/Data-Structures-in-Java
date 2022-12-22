public class sum{
    public static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumNatural(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum is: " +sumNatural(3));
    }
}
