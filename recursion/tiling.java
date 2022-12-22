public class tiling {
    public static int titlingProblem(int n) {
        // base case i.e for floor of size 2 x 1 or 2 x 0.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // f(n-1) for vertical alignment and f(n-2) for horizontal alignment and return
            // their sum which is the total ways.
            return titlingProblem(n - 1) + titlingProblem(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("The total number of ways are " + titlingProblem(3) + ".");
    }
}
