import java.util.*;

public class StringSimilarity {
    static long calculateSimilarity(String s) {
        int n = s.length();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
                j++;
            }

            sum += j;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(calculateSimilarity(s));
        }

        sc.close();
    }
}
