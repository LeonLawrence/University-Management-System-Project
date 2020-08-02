package school.management.system;

import java.util.Scanner;

public class CourseView {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem managementSystem = new ManagementSystem();

    public String execute() {
        System.out.println("Please Enter Course");
        String courseName = scan.next();
        Course course = managementSystem.getCourse(courseName);
        System.out.println(course);
        return courseName;
    }
}