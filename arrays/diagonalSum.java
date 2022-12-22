public class diagonalSum {
    public static int sum(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            if (i != array.length - 1 - i) { // overlapping condition in case of odd square matrix
                sum += array[i][array.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int array[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("The sum is: " + sum(array));
    }

}
