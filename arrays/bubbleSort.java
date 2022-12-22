public class bubbleSort {
    public static void sort(int a[]) { // O(n^2)
        int isSorted = 0;
        for (int i = 0; i < a.length; i++) { // loop for passes
            System.out.println("Working on pass number: " + i);
            isSorted = 1;
            for (int j = 0; j < a.length - i - 1; j++) // loop for comparisons
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = 0;
                }
            }
            if (isSorted == 1) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 5, 4, 4, 9, 10, 1 };
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
