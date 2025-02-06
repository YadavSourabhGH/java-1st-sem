class A{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class B extends A{
    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
}

public class methodoverlaoding {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(1, 2);
        obj.add(1, 2, 3);
    }
}
