package school.management.system;

import java.util.Scanner;

public class RegisterCourse {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem managementSystem = new ManagementSystem();

    public void regCourseExecute() {
        System.out.println("Please Enter Course");
        String courseName = scan.next();
        Course course = managementSystem.getCourse(courseName);
        System.out.println(course);

    }
}
