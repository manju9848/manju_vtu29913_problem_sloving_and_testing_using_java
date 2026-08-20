import java.util.*;

public class maximumprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            currentSum = currentSum + value;

            if (currentSum < value) {
                currentSum = value;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);
        sc.close();
    }
}