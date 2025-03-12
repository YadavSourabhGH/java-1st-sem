// 1. Write a program to find the maximum element from an ArrayList of Integers.
// 2. Write a program to remove all duplicate elements from an ArrayList.
// 3. Write a program to check if a particular element exists in a HashSet.
// 4. Implement a PriorityQueue and add elements to it. Then, print the elements in sorted order.
// 5. Implement a Stack using the Stack class in Java.
// 6. Create a TreeMap to store the mappings of student IDs to their details.
// 7. Implement a Queue using the PriorityQueue class.
// 8. Create a TreeSet and add elements to it. Then, print the elements in sorted order.
// 9. Create a HashMap to store the mappings of employee IDs to their names. 
// 10. Create a HashMap to store the mappings of product names to their prices.
import java.util.*;

class JAVA12March {
    public static void main(String[] args) {
        // Question 1: Finding maximum element in an ArrayList
        // We create a list of numbers and use Collections.max to find the largest one
        System.out.println("Question 1: Maximum element from ArrayList");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max = Collections.max(list);
        System.out.println("Maximum element is: " + max);
        
        // Question 2: Removing duplicates from ArrayList
        // Using a HashSet is an easy way to remove duplicates since sets don't allow duplicate elements
        System.out.println("\nQuestion 2: Removing duplicates");
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(3);
        System.out.println("Original list: " + listWithDuplicates);
        
        HashSet<Integer> set = new HashSet<>(listWithDuplicates);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
        
        // Question 3: Checking if an element exists in a HashSet
        // HashSet's contains() method checks if an element is present in the set
        System.out.println("\nQuestion 3: Checking element in HashSet");
        System.out.println("Set contains 1: " + set.contains(1));
        System.out.println("Set contains 10: " + set.contains(10));
        
        // Question 4: PriorityQueue implementation
        // PriorityQueue automatically orders elements based on natural ordering or a comparator
        System.out.println("\nQuestion 4: PriorityQueue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(10);
        
        System.out.print("Elements in sorted order: ");
        // poll() removes and returns the head element (smallest in natural ordering)
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        
        // Question 5: Stack implementation
        // Stack follows LIFO (Last In First Out) principle
        System.out.println("\nQuestion 5: Stack");
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        
        System.out.println("Stack: " + stack);
        System.out.println("Pop element: " + stack.pop());  // Removes "Top"
        System.out.println("Stack after pop: " + stack);
        System.out.println("Peek element: " + stack.peek()); // Just looks at "Middle" without removing
        
        // Question 6: TreeMap for student records
        // TreeMap keeps keys in sorted order automatically
        System.out.println("\nQuestion 6: TreeMap for student records");
        TreeMap<Integer, String> studentMap = new TreeMap<>();
        studentMap.put(103, "Alice: Computer Science");
        studentMap.put(101, "Bob: Physics");
        studentMap.put(105, "Charlie: Mathematics");
        studentMap.put(102, "Diana: Chemistry");
        
        System.out.println("Students sorted by ID:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
        
        // Question 7: Queue using PriorityQueue
        // A queue follows FIFO (First In First Out) principle
        System.out.println("\nQuestion 7: Queue using PriorityQueue");
        Queue<String> queue = new PriorityQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println("Queue: " + queue);
        System.out.println("Remove element: " + queue.remove());  // Removes "First" element
        System.out.println("Queue after remove: " + queue);
        
        // Question 8: TreeSet implementation
        // TreeSet keeps elements in sorted order
        System.out.println("\nQuestion 8: TreeSet");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);
        
        System.out.println("TreeSet elements (automatically sorted): " + treeSet);
        
        // Question 9: HashMap for employee records
        // HashMap stores key-value pairs for quick lookups
        System.out.println("\nQuestion 9: HashMap for employee records");
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1001, "John Smith");
        employeeMap.put(1002, "Mary Johnson");
        employeeMap.put(1003, "James Brown");
        
        System.out.println("Employee with ID 1002: " + employeeMap.get(1002));
        System.out.println("All employees: " + employeeMap);
        
        // Question 10: HashMap for product prices
        // Another example of HashMap with string keys and double values
        System.out.println("\nQuestion 10: HashMap for product prices");
        HashMap<String, Double> productMap = new HashMap<>();
        productMap.put("Laptop", 899.99);
        productMap.put("Phone", 499.99);
        productMap.put("Headphones", 79.99);
        
        System.out.println("Price of Phone: $" + productMap.get("Phone"));
        System.out.println("All products: " + productMap);
    }
}