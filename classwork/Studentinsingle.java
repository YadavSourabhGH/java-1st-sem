class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class Studentinsingle extends Person {
    private String course;

    public Studentinsingle(String name, String address, String course) {
        super(name, address);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public static void main(String[] args) {
        Studentinsingle student = new Studentinsingle("Vink", "123 parel St", "Computer Science");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Course: " + student.getCourse());

        Person person = new Studentinsingle("Sour", "456 parel St", "Physics");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
    }
}