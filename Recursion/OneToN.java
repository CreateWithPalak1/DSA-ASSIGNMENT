import java.util.*;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        f(n);
    }

    static void f(int n) {
        if (n == 0) {
            return;
        }

        f(n - 1);
        System.out.println(n);
    }
}