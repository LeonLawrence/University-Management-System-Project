package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {

    List<Student> students = new ArrayList<>();

    public Student addStudent(String name, int year, String school) {

        Student s = new Student(name, year, school);
        students.add(s);
        return s;
    }

    public int currentStudentSize() {
        return students.size();
    }


<<<<<<< Updated upstream
=======
    public Course getCourse(String courseName) {

        Course c = new Course(courseName);
        courses.add(c);
        return c;
    }

    public boolean students() {
        return students();
    }
>>>>>>> Stashed changes
}

