public class SumOfMultipleVar {
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            // Demo with integers
            System.out.println("Sum of integers: " + sum(1, 2, 3, 4, 5));
            
            // Demo with doubles
            System.out.printf("Sum of doubles: %.2f%n", 
                sum(1.5, 2.7, 3.2, 4.9));

            // Interactive input
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("How many numbers to sum? ");
            int count = scanner.nextInt();
            
            double[] numbers = new double[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }
            
            System.out.printf("Sum of entered numbers: %.2f%n", 
                sum(numbers));
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter valid numbers");
        }
    }
}