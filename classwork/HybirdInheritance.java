class A{
    public void display(){
        System.out.println("Base Class");
    }
}
class B extends A{
    public void display1(){
        System.out.println("Derived Class");
    }
}

class C extends B{
    public void display3(){
        System.out.println("B Class Derived - C");
    }
}


class D extends B{
    public void display4(){
        System.out.println("B Class Derived - D");
    }
}

public class HybirdInheritance {
    public static void main(String[] args){
        D obj = new D();
        obj.display();
    }
}
