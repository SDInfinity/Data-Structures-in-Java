public class arrayBacktrack {
    public static void backtrack(int arr[], int i, int val) {
        if (i == arr.length) {
            return;
        }
        arr[i] = val;
        backtrack(arr, i + 1, val + 1);
        arr[i] -= 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrack(arr, 0, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}