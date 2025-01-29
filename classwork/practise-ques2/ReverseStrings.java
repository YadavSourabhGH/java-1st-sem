class A{
    public void display() {
        String[] words = {"hello", "world", "java"};
        
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}



public class ReverseStrings {
    public static void main(String[] args) {
      
        B obj = new B();
obj.display();
    }
}
