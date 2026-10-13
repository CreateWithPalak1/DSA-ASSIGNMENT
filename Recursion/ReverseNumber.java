import java.util.*;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n, 0));
    }

    public static int f(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        return f(n / 10, rev * 10 + n % 10);
    }
}