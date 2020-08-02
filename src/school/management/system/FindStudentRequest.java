package school.management.system;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindStudentRequest {
    private boolean flag;
    private Scanner scan = new Scanner(System.in);

    public void execute() {

        System.out.println("Enter Student ID");
        do {
            String pattern = "\\d{0,9}";
            String userInput = scan.next();
            flag = userInput.matches(pattern);
            if (!flag) System.out.println("Invalid Input, Enter Student ID Again");
        } while (!flag);
        System.out.println("===============================================");
        System.out.println("Process Successful");
        System.out.println("===============================================");
    }
}

