class A{
    public void display() {
        int terms = 10; 
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}



public class FibonacciSeries {
    public static void main(String[] args) {
        B obj = new B();
        
obj.display();
    }

  
}
