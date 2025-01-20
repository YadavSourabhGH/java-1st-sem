public class SquareOfNumber {
    public static double calculateSquare(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number to calculate its square: ");
            double number = scanner.nextDouble();
            
            double result = calculateSquare(number);
            System.out.printf("The square of %.2f is %.2f%n", number, result);
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }
}