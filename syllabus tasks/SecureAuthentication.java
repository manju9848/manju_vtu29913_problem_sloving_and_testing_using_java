import java.util.*;

public class SecureAuthentication {

    static boolean authenticate(String username, String password) {

        if (username.length() < 3 || username.length() > 20) {
            return false;
        }

        if (password.length() < 6 || password.length() > 20) {
            return false;
        }

        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String username = sc.next();
            String password = sc.next();

            if (authenticate(username, password))
                System.out.println("SUCCESS");
            else
                System.out.println("FAILURE");
        }

        sc.close();
    }
}