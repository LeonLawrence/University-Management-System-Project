package school.management.system;

import school.management.system.command.AddStudentCommand;
import school.management.system.command.UserCommandHandler;
import school.management.system.model.Student;
import school.management.system.view.StudentView;

import java.util.Scanner;

public class UserInput {
    private ManagementSystem managementSystem = new ManagementSystem();
    private Scanner scan = new Scanner(System.in);
    private UserCommandHandler userCommandHandler = new UserCommandHandler(managementSystem);

    public void userInput() {

        System.out.println("Please Enter Student Name");
        String name = scan.next();

        System.out.println("Please Enter Student Age");
        String year = scan.next();

        System.out.println("Please Enter Student School");
        String school = scan.next();

        AddStudentCommand addStudentCommand = new AddStudentCommand(name, year, school);

        StudentView studentView = userCommandHandler.handle(addStudentCommand);
        studentView.displayStudentDetails();

//        System.out.println("Please Enter Course");
//        String courseName = scan.next();
//        Course course = managementSystem.getCourse(courseName);
//        System.out.println(course);
//
//        System.out.println("Enter Payment Amount");
//        student.payFees(scan.nextInt());
//
//        System.out.println(course);

    }
}
