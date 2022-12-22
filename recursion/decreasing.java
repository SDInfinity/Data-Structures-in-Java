class decreasing {

    public static void decrease(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        } else {
            System.out.print(n + " ");
            decrease(n - 1);
        }
    }

    public static void main(String[] args) {
        decrease(5);
    }
}
