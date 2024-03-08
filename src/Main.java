import java.util.HashSet;

public class Main {

    public static HashSet<String> createHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Value1");
        hashSet.add("Value2");
        hashSet.add("Value3");

        return hashSet;
    }

    public static void main(String[] args) {

        HashSet<String> myHashSet = createHashSet();

        String objectToCheck = "Value2";

        HashSet<String> copyHashSet = new HashSet<>(myHashSet);

        for (String element : copyHashSet) {
            if (element.equals(objectToCheck)) {
                myHashSet.remove(element);
            }
        }

        if (myHashSet.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}