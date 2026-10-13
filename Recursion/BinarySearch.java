import java.util.*;

public class BinarySearch {
    static int search(int[] a, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        }

        if (target < a[mid]) {
            return search(a, target, low, mid - 1);
        }

        return search(a, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(search(a, target, 0, n - 1));
    }
}