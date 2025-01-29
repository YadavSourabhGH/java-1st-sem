class A{
    public void display() {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
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



public class NumberPattern {
    public static void main(String[] args) {
     
        B obj = new B();
obj.display();
    }
}