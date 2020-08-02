package school.management.system;

import school.management.system.command.AddStudentCommand;
import school.management.system.command.UserCommandHandler;
import school.management.system.view.StudentView;

import java.lang.management.MemoryNotificationInfo;
import java.util.Scanner;

public class AddStudentRequest {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem managementSystem = new ManagementSystem();
    private UserCommandHandler userCommandHandler = new UserCommandHandler(managementSystem);
    private int year = 0;

    public void execute() {
        System.out.println("Please Enter Student Name");
        String name = scan.next();

        try {
            System.out.println("Please Enter Student Age");
            int year = scan.nextInt();
            System.out.println(year);
        } catch (Exception E) {
            System.out.println("number Not Entered. Restart and Try Again");
        }

        System.out.println("Please Enter Student School");
        String school = scan.next();

        AddStudentCommand addStudentCommand = new AddStudentCommand(name, year, school);

        StudentView studentView = userCommandHandler.handle(addStudentCommand);
        studentView.displayStudentDetails();
    }
}
