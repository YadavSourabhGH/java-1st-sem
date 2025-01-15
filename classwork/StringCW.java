
import java.util.Arrays;

public class StringCW {
    public static void main(String args[]){
        String name = "sourabh yadav";

        System.out.println("Hello! "+name);

        StringBuilder s = new StringBuilder("Welcome");

        System.out.println(s);

        System.out.println(name.contains("H"));

        System.out.println(name.substring(0,3));

        System.out.println(name.length());
        
        System.out.println(name.charAt(1));

        String[] splitted;
        splitted = name.split("");
        System.out.println(Arrays.toString(splitted));

        String s1 = String.join(" ","Hello","Java!","Why","are","you","so","difficult?");
        System.out.println(s1);

        System.out.println(name.startsWith("s"));
    }
}
