public class SimpleIntreasts {
    public static double calculateSI(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            
            System.out.print("Enter Principal amount: ");
            double principal = scanner.nextDouble();
            
            System.out.print("Enter Rate of interest: ");
            double rate = scanner.nextDouble();
            
            System.out.print("Enter Time (in years): ");
            double time = scanner.nextDouble();
            
            double interest = calculateSI(principal, rate, time);
            
            System.out.println("\nCalculation Results:");
            System.out.printf("Principal: $%.2f%n", principal);
            System.out.printf("Interest Rate: %.2f%%%n", rate);
            System.out.printf("Time Period: %.1f years%n", time);
            System.out.printf("Simple Interest: $%.2f%n", interest);
            System.out.printf("Total Amount: $%.2f%n", (principal + interest));
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter valid numbers");
        }
    }
}