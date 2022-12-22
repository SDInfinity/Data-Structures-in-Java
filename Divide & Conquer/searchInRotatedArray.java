
public class searchInRotatedArray {
    public static int search(int a[], int low, int high, int target) { // returns the index of target
        int mid = low + (high - low) / 2;
        if (a[mid] == target) {
            return mid;
        }
        // condition mid lies on line 1:
        if (a[mid] >= a[low]) {
            // case that target lies on left of mid
            if (target >= a[low] && target <= a[mid]) {
                return search(a, low, mid, target);
            }
            // case that target lies on right of mid anywhere on line 1 or line 2
            else {
                return search(a, mid, high, target);
            }
        }
        // condition that mid lies on line 2 a[mid]<=a[high]:
        else {
            // condition that target lies on right of mid on line 2.
            if (target >= a[mid] && target <= a[high]) {
                return search(a, mid, high, target);
            } else {
                // target lies on left of mid and on line 1 or line 2
                return search(a, low, mid, target);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println("The element is present at " + search(a, 0, a.length - 1, target) + ".");
    }
}
