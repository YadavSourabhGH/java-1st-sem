
public class Stringfn {
    public static void main(String args[]){
        String name = "Sourabh Yadav";
        String name1 = "Sourabh Yadav";
        String trim = "      Hello World        ";
        String hello = "Hello ";
        System.out.println("Compare Value: "+name.compareTo(name1)); // output : 0 cause it is same

        System.out.println("Before Trim: "+trim);
        System.out.println("After Trim: "+trim.trim());

        System.out.println("Hash code for name: "+name.hashCode());
        // The hash code is computed using formula: s[0]*31(n-1) + s[1]*31(n-2) + ... + s[n-1]
        // where,
        // s[0] is the first element of string s, s[1] is the second element and so on.
        // n is the length of the string

        System.out.println("name is_empty: "+name.isEmpty());

        System.out.println("Index of 'o' in name: "+ name.indexOf("o"));

        System.out.println("last occurrence of 'a' in name: " + name.lastIndexOf("a")); // it will return the last occurrence of the given string

        System.out.println("Concatenated string: " +hello.concat(name)); // join 2 strings

        System.out.println("Contains 'Yadav': " + name.contains("Yadav")); //it will check that string contains this or not

        System.out.println("name ends with 'av': " + name.endsWith("av")); // it will check if the string ends with given string

        System.out.println("name starts with 'Sou': " + name.startsWith("Sou")); // it will check if the string starts with given string
    }
}
