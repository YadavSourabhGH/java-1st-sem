class A{
    public void display() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}

public class BinaryPattern {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
