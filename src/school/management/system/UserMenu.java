package school.management.system;

import java.util.Scanner;

public class UserMenu {
    private Scanner scanner = new Scanner(System.in);
    private AddStudentRequest addStudent = new AddStudentRequest();
    private FindStudentRequest id = new FindStudentRequest();
    private CourseView courseView = new CourseView();
    private StudentPayFee studentPayFee = new StudentPayFee();
    private school.management.system.model.Student Student;

    public void process() {
        while (true) {
        System.out.println("==Please Enter Option== " +
                "\nEnter 1: add student" +
                "\nEnter 2: pay fee" +
                "\nEnter 3: register course");
            String scan = scanner.next();

            if (scan.equals("1")) {
                System.out.println("1 Selected");
                addStudent.execute();
            } else if (scan.equals("2")) {
                System.out.println("2 Selected");
                id.execute();
                studentPayFee.execute();
            } else if (scan.equals("3")) {
                System.out.println("3 Selected");
                courseView.execute();
            } else {
                System.out.println("===============================================");
                System.out.println("Invalid Input, Please Try Again.");
                System.out.println("===============================================");
            }
        }
    }
}
