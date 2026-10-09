import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class CLASS_TASK9_CollectionProcessing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 25, 30, 25, 45, 50, 60);
        List<Integer> uniqueNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println("After removing duplicates: " + uniqueNumbers);

        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : uniqueNumbers) {
            if (number > 20) filteredNumbers.add(number);
        }
        System.out.println("After filtering > 20: " + filteredNumbers);

        List<Integer> doubledNumbers = new ArrayList<>();
        for (int number : filteredNumbers) {
            doubledNumbers.add(number * 2);
        }
        System.out.println("After multiplying by 2: " + doubledNumbers);

        Collections.sort(doubledNumbers);
        System.out.println("After sorting ascending: " + doubledNumbers);
    }
}