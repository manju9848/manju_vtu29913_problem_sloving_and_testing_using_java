class Singleton {

    private static Singleton single_instance = null;

    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getSingleInstance();
        s.str = "hello world";

        System.out.println(
            "Hello I am a singleton! Let me say " + s.str + " to you"
        );
    }
}