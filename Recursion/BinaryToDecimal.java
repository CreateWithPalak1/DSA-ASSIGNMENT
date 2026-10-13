import java.util.*;

public class BinaryToDecimal {
    static int decimal(String s, int i) {
        if (i == s.length()) {
            return 0;
        }

        return (s.charAt(i) - '0') * (int)Math.pow(2, s.length() - 1 - i)
                + decimal(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(decimal(s, 0));
    }
}