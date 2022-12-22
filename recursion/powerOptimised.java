public class powerOptimised { // O(log n)
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pow(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
