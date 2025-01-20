public class LargestOf3Numbers {
    public static int findLargest(int a, int b) {
        return Math.max(a, b);
    }
    
    public static int findLargest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("How many numbers to compare (2 or 3)? ");
            int count = scanner.nextInt();
            
            if (count == 2) {
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                
                int largest = findLargest(num1, num2);
                System.out.println("Largest number is: " + largest);
            } 
            else if (count == 3) {
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                System.out.print("Enter third number: ");
                int num3 = scanner.nextInt();
                
                int largest = findLargest(num1, num2, num3);
                System.out.println("Largest number is: " + largest);
            }
            else {
                System.out.println("Please choose either 2 or 3 numbers to compare");
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter valid integer numbers");
        }
    }
}