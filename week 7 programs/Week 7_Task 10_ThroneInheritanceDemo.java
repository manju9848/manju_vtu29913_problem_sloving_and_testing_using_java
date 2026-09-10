
import java.util.*;

class ThroneInheritance {

    private String kingName;
    private Map<String, List<String>> family = new HashMap<>();
    private Set<String> dead = new HashSet<>();
    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        family.put(kingName, new ArrayList<>());
    }
    public void birth(String parentName, String childName) {
        family.putIfAbsent(childName, new ArrayList<>());
        family.get(parentName).add(childName);
    }
    public void death(String name) {
        dead.add(name);
    }
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(kingName, order);
        return order;
    }
    private void dfs(String person, List<String> order) {
        if (!dead.contains(person)) {
            order.add(person);
        }
        for (String child : family.get(person)) {
            dfs(child, order);
        }
    }
}

public class ThroneInheritanceDemo {

    public static void main(String[] args) {

        ThroneInheritance t = new ThroneInheritance("king");

        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");

        t.birth("andy", "matthew");

        t.birth("bob", "alex");
        t.birth("bob", "asha");

        System.out.println(t.getInheritanceOrder());

        t.death("bob");

        System.out.println(t.getInheritanceOrder());
    }
}