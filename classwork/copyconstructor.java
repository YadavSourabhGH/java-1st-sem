class Main{
    int x;
    Main(int x){
        this.x=x;
        System.out.println("x: "+x);
    }

    Main(Main s){
        this.x = s.x;
       System.err.println("x: "+x);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        Main obj = new Main(10);
        Main obj1 = new Main(obj);
    }
}
