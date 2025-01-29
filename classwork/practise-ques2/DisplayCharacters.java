class A{
    public void display() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        } 
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}



public class DisplayCharacters {
    public static void main(String[] args) {
       
        B obj = new B();
obj.display();
    }
}
