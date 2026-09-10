public class MyHashSet {

    private boolean[] set;
    public MyHashSet() {
        set = new boolean[1000001];
    }
    public void add(int key) {
        set[key] = true;
    }
    public boolean contains(int key) {
        return set[key];
    }
    public void remove(int key) {
        set[key] = false;
    }
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(3)); // false

        myHashSet.add(2);

        System.out.println(myHashSet.contains(2)); // true

        myHashSet.remove(2);

        System.out.println(myHashSet.contains(2)); // false
    }
}