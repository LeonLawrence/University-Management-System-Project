package school.management.system;

import java.util.Scanner;

public class UserInput {
    private ManagementSystem managementSystem = new ManagementSystem();
    private Scanner scan = new Scanner(System.in);

    public void userInput() {

//        System.out.println("Please Enter Student Name");
//        String name = scan.next();
//
//        System.out.println("Please Enter Student Age");
//        int year = scan.nextInt();
//
//        System.out.println("Please Enter Student School");
//        String school = scan.next();

<<<<<<< Updated upstream
        Student student = managementSystem.addStudent(name, year, school);
        System.out.println(student);

        System.out.println("Enter Payment Amount");
        student.payFees(scan.nextInt());
=======
//        AddStudentCommand addStudentCommand = new AddStudentCommand(name, year, school);

//        StudentView studentView = userCommandHandler.handle(addStudentCommand);
//        studentView.displayStudentDetails();
>>>>>>> Stashed changes

        System.out.println(student);

    }
}
