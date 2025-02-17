abstract class Geek {
    
    abstract void turnON();
    abstract void turnOFF();

    public void display() {
        System.out.println("Geek");
    }
}

class TV extends Geek {
    public void turnON() {
        System.out.println("TV is ON");
    }

    public void turnOFF() {
        System.out.println("TV is OFF");
    }
}

public class abstraction {
public static void main(String[] args) {
    TV tv = new TV();
    tv.turnON();
    tv.turnOFF();
    tv.display();
}
}
