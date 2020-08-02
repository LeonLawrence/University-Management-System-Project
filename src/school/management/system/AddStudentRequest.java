package school.management.system;

import school.management.system.command.AddStudentCommand;
import school.management.system.command.UserCommandHandler;
import school.management.system.view.StudentView;

import java.util.Scanner;

public class AddStudentRequest {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem managementSystem = new ManagementSystem();
    private UserCommandHandler userCommandHandler = new UserCommandHandler(managementSystem);

    public void execute() {
        System.out.println("Please Enter Student Name");
        String name = scan.next();

        System.out.println("Please Enter Student Age");
        String year = scan.next();

        System.out.println("Please Enter Student School");
        String school = scan.next();

        AddStudentCommand addStudentCommand = new AddStudentCommand(name, year, school);

        StudentView studentView = userCommandHandler.handle(addStudentCommand);
        studentView.displayStudentDetails();
    }
}
