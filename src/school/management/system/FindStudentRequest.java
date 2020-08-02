package school.management.system;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindStudentRequest {
    private Scanner scan = new Scanner(System.in);

    private ManagementSystem managementSystem = new ManagementSystem();

    public void execute() {
        try {
            System.out.println("Please Enter Student ID");
            int id = scan.nextInt();
            System.out.println("Searching student id: " + id);
        } catch (Exception E) {
            System.out.println("Invalid Input, Restart and Try Again");
        }
    }
}
