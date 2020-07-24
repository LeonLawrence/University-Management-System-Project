package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Teacher> TeacherList = new ArrayList<>();
        Teacher teacher1 = new Teacher(null);
        TeacherList.add(teacher1);
        teacher1.setId(1);
        teacher1.setName("Binh");
        teacher1.setRole("Teacher");
        teacher1.setWorkStatus("Full Time");
        System.out.println(teacher1.toString());

        System.out.println("----------------------------------------------------------------------------------------");

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(2030, null);
        studentList.add(student1);
        student1.setId(2);
        student1.setName("Leon");
        student1.setRole("Student");
        student1.setYear(2020);
        student1.setSchool("University of Greenwich");
        System.out.println(student1.toString());


    }
}