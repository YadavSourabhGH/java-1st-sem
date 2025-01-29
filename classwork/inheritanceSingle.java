class Employee{
    void display1() {
        System.out.println("This is the Parent class");
    }
}

class dept extends Employee{
    void display2() {
        System.out.println("This is the Child class");
    }
        // public static void main(String[] args){
        //     dept a = new dept();
        //     a.display1();
        //     a.display2();
        //     }
    
}

public class inheritanceSingle {
    // single inheritance 
   
public static void main(String[] args){
    dept a = new dept();
    a.display1();
    a.display2();
    }
}


// jisme ham main function likhte hai wahi ussi class ka naam hamamare file ka naam hoga 