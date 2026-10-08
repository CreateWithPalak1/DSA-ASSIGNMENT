import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(f(n));
    }

    static int f(int n) {
        if (n == 0) {
            return 0;
        }

        return n + f(n - 1);
    }
}