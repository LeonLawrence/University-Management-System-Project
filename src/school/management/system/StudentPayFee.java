package school.management.system;

import java.util.Scanner;

public class StudentPayFee {
    private boolean flag;
    private Scanner scan = new Scanner(System.in);

    public void execute() {
        System.out.println("Enter Amount to Pay Course Fee");
        do {
            String pattern = "\\d{0,9}";
            String userInput = scan.next();
            flag = userInput.matches(pattern);
            if (!flag) System.out.println("Invalid Input, Enter Amount Again");
        } while (!flag);
        System.out.println("===============================================");
        System.out.println("You Have Paid");
        System.out.println("===============================================");
    }
}
