public class StringOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        System.out.println("Original StringBuilder: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        
        // Append operation
        sb.append(" World");
        System.out.println("\nAfter append: " + sb);
        
        // Insert operation
        sb.insert(5, " Dear");
        System.out.println("After insert: " + sb);
        
        // Replace operation
        sb.replace(6, 10, "Sweet");
        System.out.println("After replace: " + sb);
        
        // Delete operation
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);
        
        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Chaining operations
        StringBuilder sb2 = new StringBuilder("Java")
            .append(" Programming")
            .insert(4, " is")
            .reverse();
        System.out.println("\nChained operations result: " + sb2);
    }
}