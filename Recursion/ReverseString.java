import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(f(s));
    }

    public static String f(String s) {
        if (s.length() == 0) {
            return "";
        }

        return f(s.substring(1)) + s.charAt(0);
    }
}