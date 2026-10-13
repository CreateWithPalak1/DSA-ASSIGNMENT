import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (f(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean f(String s, int l, int r) {
        if (l >= r) {
            return true;
        }

        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }

        return f(s, l + 1, r - 1);
    }
}