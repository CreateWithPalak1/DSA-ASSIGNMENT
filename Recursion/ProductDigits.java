import java.util.*;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 * f(n / 10);
    }
}