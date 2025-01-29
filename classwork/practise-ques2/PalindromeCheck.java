class A{
    public void display() {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}


public class PalindromeCheck {
    public static void main(String[] args) {
       
        B obj = new B();
obj.display();
    }
}
