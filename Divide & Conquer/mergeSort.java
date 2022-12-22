public class mergeSort {
    public static void merge(int a[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        // temp array
        int b[] = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        // now for remaining elements
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= high) {
            b[k] = a[j];
            j++;
            k++;
        }
        // now copy the elements into the original array
        for (k = 0, i = low; k < b.length; k++, i++) {
            a[i] = b[k];
        }
    }

    // call for sub-arrays till base case
    public static void sort(int a[], int low, int high) {
        int mid = low + (high - low) / 2;
        if (low < high) {
            // calling for left subarray
            sort(a, low, mid);
            // calling for right subarray
            sort(a, mid + 1, high);
            // finally merging the sorted arrays
            merge(a, low, mid, high);
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