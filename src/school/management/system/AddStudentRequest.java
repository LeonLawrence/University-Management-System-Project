package school.management.system;

import school.management.system.command.AddStudentCommand;
import school.management.system.command.UserCommandHandler;
import school.management.system.model.Student;
import school.management.system.view.StudentView;

import java.util.Scanner;

public class AddStudentRequest {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem mSystem = new ManagementSystem();
    private UserCommandHandler userCommandHandler = new UserCommandHandler(mSystem);


    public Student execute() {
        System.out.println("Please Enter Student Name");
        String name = scan.next();

        System.out.println("Please Enter Student Age");
        int year = scan.nextInt();

        System.out.println("Please Enter Student School");
        String school = scan.next();

        AddStudentCommand addStudentCommand = new AddStudentCommand(name, year, school);
        StudentView studentView = userCommandHandler.handle(addStudentCommand);
        studentView.displayStudentDetails();
//        System.out.println(mSystem.addStudent(name, year, school));
        return new Student(name, year, school);
    }

}