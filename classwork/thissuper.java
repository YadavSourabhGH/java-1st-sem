class Demo {
    Demo(){
        System.out.println("Demo class constructor");
    }

    Demo(int a){
        this();
        System.out.println(a);
    }
}

public class thissuper extends Demo  {
    thissuper(int a){
        super(a);
    }

    public static void main(String[] args) {
        new thissuper(10);
    }

}
