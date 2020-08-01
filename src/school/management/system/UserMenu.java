package school.management.system;

import school.management.system.command.UserCommandHandler;
import school.management.system.model.Student;
import school.management.system.view.StudentPaymentView;
import school.management.system.view.StudentView;

import java.util.Scanner;

public class UserMenu {
    private Scanner scanner = new Scanner(System.in);
    private AddStudentRequest addStudent = new AddStudentRequest();
    private FindStudentRequest id = new FindStudentRequest();
    private RegisterCourse registerCourse = new RegisterCourse();
    private StudentPayFee studentPayFee = new StudentPayFee();
    private school.management.system.model.Student Student;

    public void process() {
        System.out.println("==Please Enter Option== " +
                "\nEnter 1: add student" +
                "\nEnter 2: pay fee" +
                "\nEnter 3: register course");
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == 1) {
                System.out.println("1 Selected");
                addStudent.execute();
            } else if (inputNumber == 2) {
                System.out.println("2 Selected");
                id.execute();
                studentPayFee.execute();
            } else if (inputNumber == 3) {
                System.out.println("3 Selected");
                registerCourse.regCourseExecute();
            } else {
                System.out.println("Invalid Input, Please Try Again.");

            }
        }
    }
}

