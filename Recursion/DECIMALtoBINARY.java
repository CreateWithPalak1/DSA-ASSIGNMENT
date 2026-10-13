import java.util.*;

public class DECIMALtoBINARY {
    static String binary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return binary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0)
            System.out.println("-" + binary(-n));
        else
            System.out.println(binary(n));
    }
}