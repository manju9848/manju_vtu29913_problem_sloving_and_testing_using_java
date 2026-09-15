import java.util.*;

public class RepeatedSubstring {

    static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) {
                continue;
            }

            boolean valid = true;
            for (int i = len; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % len)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(repeatedSubstringPattern(s));

        sc.close();
    }
}
