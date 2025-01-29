// 2  Write a Java program to display all the vowels from a given string
// This program accepts a string and prints all vowels (A, E, I, O, U) found in the string.


public class DisplayVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
    }
}
