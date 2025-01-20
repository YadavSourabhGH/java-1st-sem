import java.util.Scanner;
public class Calculator {
    Scanner input = new Scanner(System.in);
    private double num1, num2;
    private char operator;

    public void getInput() {
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
    }

    public double calculate() {
        switch(operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': 
                if(num2 != 0) return num1 / num2;
                else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public void displayResult() {
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, calculate());
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getInput();
        calc.displayResult();
    }
}