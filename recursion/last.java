public class last {
    public static int firstOccur(int arr[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 5 };
        System.out.println(firstOccur(arr, 5, arr.length - 1));
    }
}
