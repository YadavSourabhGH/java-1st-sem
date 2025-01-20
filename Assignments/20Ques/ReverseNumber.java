public class ReverseNumber {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            int number = scanner.nextInt();
            
            int reversedNumber = reverse(number);
            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter a valid integer number.");
        }
    }
}