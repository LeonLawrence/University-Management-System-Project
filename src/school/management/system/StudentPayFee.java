package school.management.system;

import java.util.Scanner;

public class StudentPayFee {
    private Scanner scan = new Scanner(System.in);

    public void execute() {
        try {
            System.out.println("Enter Amount to Pay Course Fee");
            int amount = scan.nextInt();
            System.out.println("Amount Paid: " + amount);
        } catch (Exception E) {
            System.out.println("Amount Invalid, Restart and Try Again");
        }
    }
}
