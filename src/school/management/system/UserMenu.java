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
            int inputNumber = scanner.nextInt();
        try{
        } catch(Exception E) {
            System.out.println("invalid input");
        }
            if (scanner.equals("1")) {
                System.out.println("1 Selected");
                addStudent.execute();
            } else if (scanner.equals("2")) {
                System.out.println("2 Selected");
                id.execute();
                studentPayFee.execute();
            } else if (scanner.equals("3")) {
                System.out.println("3 Selected");
                courseView.execute();
            } else {
                System.out.println("Invalid Input, Please Try Again.");

            }
        }
    }
}
