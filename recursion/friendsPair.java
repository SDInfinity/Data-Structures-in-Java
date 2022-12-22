public class friendsPair {
    public static int arrangement(int n) {
        if (n == 1 || n == 2) {
            return n;
        } else {
            // f(n-1) for single and (f(n-1)*f(n-2)) for pairing and return their sum for
            // total ways
            return arrangement(n - 1) + (arrangement(n - 1) * arrangement(n - 2));
        }
    }

    public static void main(String[] args) {
        System.out.println(("The total number of ways are: " + arrangement(3))+".");
    }
}
