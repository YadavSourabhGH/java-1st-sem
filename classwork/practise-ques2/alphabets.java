class A{
    public void display() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class B extends A{
    public void X() {
       System.out.println("I do nothing");
    }
}


public class alphabets{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
