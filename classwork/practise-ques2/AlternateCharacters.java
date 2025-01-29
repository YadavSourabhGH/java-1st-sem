class A{
    public void display(){
        String str = "HelloWorld";
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}

class B extends A{
    public void X(){
        System.out.println("I Do Nothing");
    }
}

public class AlternateCharacters {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}