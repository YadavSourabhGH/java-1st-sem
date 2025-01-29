public class AlternateCharacters {
    public static void main(String[] args) {
        String str = "HelloWorld";
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}