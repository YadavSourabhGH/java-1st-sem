public class Factorial {

    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Iterative Factorial of " + number + " is: " + factorialIterative(number));
    }
}