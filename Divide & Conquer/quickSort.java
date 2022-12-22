public class quickSort {
    public static int partition(int a[], int low, int high) {
        int i = low, j = high;
        int pivot = a[low]; // considering the first element as pivot
        do {
            if (a[i] <= pivot) {
                i++;
            }
            if (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp1 = a[i];
                a[i] = a[j];
                a[j] = temp1;
            }
        } while (i < j);
        // swap pivot and j
        int temp2 = a[j];
        a[j] = a[low];
        a[low] = temp2;

        // return partition index
        return j;
    }

    public static void sort(int a[], int low, int high) {
        int partitionIndex = 0;
        if (low < high) {
            partitionIndex = partition(a, low, high);
            sort(a, low, partitionIndex);
            sort(a, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
