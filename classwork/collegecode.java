import java.util.Scanner;

class college{
    // cno, cname, cadderess
    int cno;
    String cname;
    String cadrs;
    college(String cname, int cno, String cadrs){
        this.cno=cno;
        this.cname=cname;
        this.cadrs=cadrs;
    }
    public void displayDetails(){
        System.out.println("College Name :\t"+cname);
        System.out.println("College No :\t"+cno);
        System.out.println("College Address :\t"+cadrs);
    }
}

class dept extends college{
    // dno,dname
    int dno;
    String dname;
    dept(String cname, int cno, String cadrs, String dname, int dno){
        super(cname, cno, cadrs);
        this.dno=dno;
        this.dname=dname;
    }
    @Override
    public void displayDetails(){
        System.out.println("Department Name :\t"+dname);
        System.out.println("Department No :\t"+dno);
        // super.displayDetails();
        System.out.println("College Name :\t"+cname);
        System.out.println("College No :\t"+cno);
        System.out.println("College Address :\t"+cadrs);

    }
}

public class collegecode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter College Name:");
        String cname = scanner.nextLine();

        System.out.print("Enter College No:");
        int cno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter College Address:");
        String cadrs = scanner.nextLine();

        System.out.print("Enter Department Name:");
        String dname = scanner.nextLine();

        System.out.print("Enter Department No:");
        int dno = scanner.nextInt();

        scanner.close();

        dept dpt = new dept(cname, cno, cadrs, dname, dno);
        dpt.displayDetails();
    }
}
