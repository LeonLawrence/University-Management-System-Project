package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {

    List<Student> students = new ArrayList<>();

    public void addStudent(String name, int year, String school) {
        Student s = new Student(name, year, school);
        students.add(s);
        System.out.println(s);
    }

    public boolean getStudent() {
        return true;
    }
}
