import java.util.*;
import java.util.stream.*;

public class SalaryTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> salary + salary / 10)
                .collect(Collectors.toList());

        updatedSalaries.forEach(salary -> System.out.print(salary + " "));
    }
}