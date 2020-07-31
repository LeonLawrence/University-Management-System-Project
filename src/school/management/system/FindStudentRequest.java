package school.management.system;

import school.management.system.model.Student;

import java.util.Scanner;

public class FindStudentRequest {
    private Scanner scan = new Scanner(System.in);
    private ManagementSystem managementSystem = new ManagementSystem();

    public int execute() {
        System.out.println("Please Enter Student ID");
        int id = scan.nextInt();
        return id;
    }
}
