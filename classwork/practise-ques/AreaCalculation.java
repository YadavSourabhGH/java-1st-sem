public class AreaCalculation {
    public static void main(String[] args) {
        int side = 4; 
        int radius = 5; 
        int squareArea = side * side;
        double circleArea = 3.14159 * radius * radius;

        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of circle: " + circleArea);
    }
}