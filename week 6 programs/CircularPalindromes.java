import java.util.*;

public class CircularPalindromes {
    static int longestPalindrome(String s) {
        int n = s.length();

        if (n == 0) {
            return 0;
        }
        char[] t = new char[2 * n + 3];

        t[0] = '^';
        t[1] = '#';

        for (int i = 0; i < n; i++) {
            t[2 * i + 2] = s.charAt(i);
            t[2 * i + 3] = '#';
        }

        t[2 * n + 2] = '$';

        int[] p = new int[t.length];

        int center = 0;
        int right = 0;
        int maxLength = 0;

        for (int i = 1; i < t.length - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while (t[i + (1 + p[i])] == t[i - (1 + p[i])]) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            maxLength = Math.max(maxLength, p[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String doubled = s + s;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {

            String rotation = doubled.substring(i, i + n);

            int answer = longestPalindrome(rotation);

            result.append(answer).append('\n');
        }

        System.out.print(result);

        sc.close();
    }
}