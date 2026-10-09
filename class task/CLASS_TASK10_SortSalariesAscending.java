import java.util.Arrays;

public class CLASS_TASK10_SortSalariesAscending {
    public static void main(String[] args) {
        int[] salaries = {50000, 28000, 60000, 45000, 32000};
        Arrays.sort(salaries);
        System.out.println("Salaries in ascending order: " + Arrays.toString(salaries));
    }
}