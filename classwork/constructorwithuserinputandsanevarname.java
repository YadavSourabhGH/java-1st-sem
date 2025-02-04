import java.util.Scanner;

public class constructorwithuserinputandsanevarname {
    constructorwithuserinputandsanevarname(int x){
       System.out.println("x "+x);
    }
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();
        new constructorwithuserinputandsanevarname(x);
    }

}

/*
Scanner is used to accept user input,
Variable declared in main, and input accepted in main --> read input with sc.nextInt()
called the parametrized contructor with the accepted value as the argument
show output in the contructor method
 */
