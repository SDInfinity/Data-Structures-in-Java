public class countSort {

    public static void sort(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]] = count[a[i]] + 1;
        }
        int i = count.length-1, j = 0;
        while (i >= 0) {
            if (count[i] > 0) {
                a[j] = i;
                count[i] = count[i] - 1;
                j++;
            } else {
                i--;
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