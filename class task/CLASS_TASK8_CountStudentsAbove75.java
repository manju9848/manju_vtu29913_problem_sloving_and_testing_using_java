public class CLASS_TASK8_CountStudentsAbove75 {
    public static void main(String[] args) {
        int[] marks = {80, 92, 65, 78, 90, 72, 85};
        int count = 0;

        for (int mark : marks) {
            if (mark > 75) count++;
        }
        System.out.println("Number of students scoring above 75: " + count);
    }
}