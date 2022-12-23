public class majority_element {
    public static int count(int a[], int num, int low, int high) {
        int count = 0;
        for (int i = low; i < high; i++) {
            if (a[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majority(int a[], int low, int high) {
        // base case
        if (low == high) {
            return a[low];
        }
        int mid = low + (high - low) / 2;
        // run recursively on left and right sub arrays
        int left = majority(a, low, mid);
        int right = majority(a, mid + 1, high);
        // if they agree on the same majority element return anyone of them
        if (left == right) {
            return left;
        }
        int leftCount = count(a, left, low, high);
        int rightCount = count(a, right, low, high);

        return (leftCount > rightCount) ? left : right;

    }

    public static void main(String[] args) {
        int a[] = { 4, 2, 3, 7, 7};
        System.out.println("The majority element is : " + majority(a, 0, a.length - 1));
    }
}
