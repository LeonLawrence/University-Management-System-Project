package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Interface system = new Interface();
        system.systemLog();

        ManagementSystem managementSystem = new ManagementSystem();
        // scanner
        String name = "leon";
        int year = 2020;
        String school = "UCL";
        managementSystem.addStudent(name, year, school);
    }
}