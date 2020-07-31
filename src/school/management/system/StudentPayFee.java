package school.management.system;

import java.util.Scanner;

public class StudentPayFee {
    Scanner scan = new Scanner(System.in);

    public int execute() {
        System.out.println("Please Enter Payable Amount");
        int amount = scan.nextInt();
        return amount;
    }
}
