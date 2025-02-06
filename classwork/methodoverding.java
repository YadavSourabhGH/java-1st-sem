// Method Overriding
class A{
    public void add (int a, int b){
        int c=a+b;
        System.out.println("Add :"+c);
    }
}
class B extends A{
    @Override
    public void add (int a, int b){
        int c=a+b;
        System.out.println("Add-2 :"+c);
    }
}
public class methodoverding {
    public static void main(String[] args) {
        B obj=new B();
        obj.add(20,10);
    }
}