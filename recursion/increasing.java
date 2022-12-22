class increasing {

    public static void increase(int n) {
        if (n == 0) {
            System.out.print(0 + " ");
            return;
        } else {
            increase(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        increase(5);
    }
}
