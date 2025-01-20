public class SumOfIntegers {
    
    public static int sumUsingFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
   
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum using for loop: " + sumUsingFor(number));

    }
}