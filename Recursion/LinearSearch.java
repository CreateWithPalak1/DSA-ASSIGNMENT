import java.util.*;

public class LinearSearch {
    static int search(int[] a, int target, int i) {
        if (i == a.length) {
            return -1;
        }

        if (a[i] == target) {
            return i;
        }

        return search(a, target, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(search(a, target, 0));
    }
}