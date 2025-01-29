public class ReverseStrings {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java"};
        
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }
    }
}
