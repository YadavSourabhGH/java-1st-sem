public class Perimeter {
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Perimeter Calculator");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.print("Choose shape (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.printf("Rectangle perimeter: %.2f%n", calculatePerimeter(length, width));
                    break;
                    
                case 2:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.printf("Circle perimeter: %.2f%n", calculatePerimeter(radius));
                    break;
                    
                case 3:
                    System.out.print("Enter side 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter side 2: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter side 3: ");
                    double c = scanner.nextDouble();
                    System.out.printf("Triangle perimeter: %.2f%n", calculatePerimeter(a, b, c));
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Please enter valid numbers.");
        }
    }
}