

public class Methods {
    public void NonStatic(){
        int a = 10;
        System.out.println(a);
    }
    public static void WithStatic(){
        int b = 6;
        System.out.println(b);
    }

    public int WithReturnType(){
        int c = 3;
        return c;
    }
    public static void main(String[] args){
        Methods m = new Methods();
        m.NonStatic();

        Methods.WithStatic();

        System.out.println(m.WithReturnType());
    }
}
