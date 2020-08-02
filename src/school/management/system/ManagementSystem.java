package school.management.system;

import school.management.system.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {

    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();

    public Student addStudent(String name, String year, String school) {

        Student s = new Student(name, year, school);
        students.add(s);
        return s;
    }

    public int currentStudentSize() {
        return students.size();
    }


    public Course getCourse(String courseName) {

        Course c = new Course(courseName);
        courses.add(c);
        return c;
    }
}




