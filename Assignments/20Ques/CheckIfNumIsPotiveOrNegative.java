public class CheckIfNumIsPotiveOrNegative {
    public static String checkNumber(double number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            
            String result = checkNumber(number);
            System.out.println("The number " + number + " is " + result);
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }
}