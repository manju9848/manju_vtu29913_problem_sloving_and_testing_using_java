
import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOfExample {

    static String count(ArrayList<Object> myList) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : myList) {
            if (obj instanceof Student) {
                studentCount++;
            }

            if (obj instanceof Rockstar) {
                rockstarCount++;
            }

            if (obj instanceof Hacker) {
                hackerCount++;
            }
        }

        return studentCount + " " + rockstarCount + " " + hackerCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Object> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student")) {
                myList.add(new Student());
            } else if (type.equals("Rockstar")) {
                myList.add(new Rockstar());
            } else if (type.equals("Hacker")) {
                myList.add(new Hacker());
            }
        }

        System.out.println(count(myList));

        sc.close();
    }
}