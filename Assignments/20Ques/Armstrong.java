public class Armstrong {
    public static boolean isArmstrong(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number to check if Armstrong: ");
            int number = scanner.nextInt();

            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number");
            } else {
                System.out.println(number + " is not an Armstrong number");
            }

            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid positive integer");
        }
    }
}