import java.util.*;

public class NToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        f(n);
    }

    public static void f(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        f(n - 1);
    }
}