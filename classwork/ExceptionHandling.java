public class ExceptionHandling {
    public static int divide(int a, int b) {
       if (b == 0) {
           throw new ArithmeticException("Division by zero is not allowed");
       }
         return a/b;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 0;
        try {
            System.out.println(divide(n, m));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is always executed");
        }
    }
    // ---------------------------------------------------------------
    // public static void main(String[] args) {
    //     int n = 10;
    //     int m = 0;
    //     try {
    //         System.out.println(n/m);
    //     } catch (ArithmeticException e) {
    //         System.out.println("Division by zero is not allowed");
    //     }
    //     finally {
    //         System.out.println("This is always executed");
    //     }
    // }
}
