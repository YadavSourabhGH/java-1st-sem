import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        System.out.println(treeMap); // Output: {1=One, 2=Two, 3=Three} (Sorted Order)
        System.out.println("Value for key 2: " + treeMap.get(2)); // Output: Value for key 2: Two
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
        System.out.println("Contains key 3: " + treeMap.containsKey(3)); // Output: Contains key 3: true
        System.out.println("Contains value 'Two': " + treeMap.containsValue("Two")); // Output: Contains value 'Two': true
        treeMap.remove(2);
        System.out.println("Contains key 2: " + treeMap.containsKey(2)); // Output: Contains key 2: false
    }
}