// File: MultipleInheritanceExample.java

interface BasicInfo {
    void getDetails(String name, String address);
    void displayDetails();
}

interface CourseInfo {
    void getCourse(String course);
    void displayCourse();
}

class Trainee implements BasicInfo, CourseInfo {
    String name, address, course;

    @Override
    public void getDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    @Override
    public void getCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayCourse() {
        System.out.println("Course: " + course);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.getDetails("Eve", "101 Maple St");
        trainee.getCourse("Electrical Engineering");
        trainee.displayDetails();
        trainee.displayCourse();
    }
}