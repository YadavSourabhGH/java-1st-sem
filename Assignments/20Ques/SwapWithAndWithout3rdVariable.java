public class SwapWithAndWithout3rdVariable {
    
    public static void swapWithTemp(int a, int b) {
        System.out.println("Before swap (with temp): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (with temp): a = " + a + ", b = " + b);
    }
    
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swap (without temp): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (without temp): a = " + a + ", b = " + b);
    }
    
    public static void main(String[] args) {
        int x = 10, y = 20;
        swapWithTemp(x, y);
        System.out.println();
        swapWithoutTemp(x, y);
    }
}