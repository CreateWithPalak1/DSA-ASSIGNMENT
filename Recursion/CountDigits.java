import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(Math.abs(n)));
    }

    public static int f(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + f(n / 10);
    }
}