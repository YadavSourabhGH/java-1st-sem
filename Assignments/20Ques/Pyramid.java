public class Pyramid {
    public static void printPyramid(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter pyramid height: ");
            int height = scanner.nextInt();
            
            printPyramid(height);
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid positive integer");
        }
    }
}