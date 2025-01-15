public class StringBldr {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Original: " + sb);  // Hello World
        
        // 1. insert(offset, String): Inserts string at specified position
        // Adds " Beautiful" after "Hello"
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);  // Hello Beautiful World
        
        // 2. delete(start, end): Removes characters from start to end-1
        // Removes " Beautiful" (from 5 to 14)
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);  // Hello World
        
        // 3. deleteCharAt(index): Removes single character at index
        // Removes space at position 5
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);  // HelloWorld
        
        // 4. capacity(): Returns current allocated space
        // Default is 16, or string length + 16 if initial string is longer
        System.out.println("Capacity: " + sb.capacity());  // 27 (11 + 16)
        
        // 5. setCharAt(index, char): Changes character at specified index
        // Changes 'H' to 'h'
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);  // helloWorld
        
        // 6. substring(start, end): Extracts portion from start to end-1
        // Gets first 5 characters
        System.out.println("Substring: " + sb.substring(0, 5));  // hello
        
        // 7. indexOf(String): Returns first position of substring
        // Finds position of "World"
        System.out.println("Index of 'World': " + sb.indexOf("World"));  // 5
        
        // 8. lastIndexOf(String): Returns last position of substring
        // Finds last 'l' in string
        System.out.println("Last index of 'l': " + sb.lastIndexOf("l"));  // 8
        
        // 9. setLength(newLength): Changes StringBuilder length
        // Truncates to 5 characters
        sb.setLength(5);
        System.out.println("After setLength: " + sb);  // hello
        
        // 10. trimToSize(): Reduces capacity to actual length
        // Optimizes memory usage
        sb.trimToSize();
        System.out.println("After trim capacity: " + sb.capacity());  // 5
    }
}