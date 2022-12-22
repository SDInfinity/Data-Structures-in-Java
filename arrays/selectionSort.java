public class selectionSort {

    public static void sort(int a[]) // O(n^2)
    {
        int min_index;
        for (int i = 0; i < a.length; i++) // loop for number of passes
        {
            min_index = i;
            for (int j = i + 1; j < a.length; j++) // loop for comparisons
            {
                if (a[min_index] > a[j]) {
                    int temp = a[min_index];
                    a[min_index] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { -2, -3, -5, -4, -4, -9, -10, -1 };
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
