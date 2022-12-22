public class insertionSort {

    public static void sort(int a[]) { // O(n^2)
        int key, j;
        for (int i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
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
