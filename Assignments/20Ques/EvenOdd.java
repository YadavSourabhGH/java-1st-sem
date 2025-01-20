import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        if (input.hasNextInt()) {
            int number = input.nextInt();
            String result = isEven(number) ? "even" : "odd";
            System.out.println(number + " is " + result);
        } else {
            System.out.println("Please enter a valid integer");
        }
        
        input.close();
    }
}