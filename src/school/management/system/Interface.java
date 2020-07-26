package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Interface {


public void systemLog() {

    Teacher teacher1 = new Teacher(1, "Binh", 900, " University of Greenwich ");


    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(teacher1);

    Student student1 = new Student(1, "Jim", 1, " University of Greenwich ");


    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);

    Course course1 = new Course("Business");
    Course course2 = new Course("Computing");
    Course course3 = new Course("Science");
    Course course4 = new Course("Math");

    List<Course> courseList = new ArrayList<>();
    courseList.add(course1);
    courseList.add(course2);
    courseList.add(course3);
    courseList.add(course4);
    School greenwich = new School();
    Administrator greenwichCourse = new Administrator(courseList);

    Teacher megan = new Teacher(4, "Megan", 700, " University of Greenwich ");
    greenwich.addTeacher(megan);

    Student bob = new Student(4, "Bob", 3, " University of Greenwich ");
    greenwich.addStudent(bob);
    System.out.println();

    System.out.println(megan);
    System.out.println(bob);

    System.out.println();

    student1.payFees(500);
    student1.payFees(100);

    System.out.println("Institution Account Balance: £" + greenwich.getTotalMoneyEarned());

    System.out.println();

    System.out.println("--------------------LOG--------------------");
    megan.receiveSalary(megan.getSalary());
    System.out.println("Institution has paid " + megan.getName() + " and now has £" + greenwich.getTotalMoneyEarned());

//        teacher2.receiveSalary(teacher2.getSalary());
//        System.out.println("Institution has paid " + teacher2.getName() + " and now has £" + greenwich.getTotalMoneyEarned());

    System.out.println();

    System.out.println("--------------------UPDATE--------------------");
    System.out.println(megan + " for teaching the subject " + course1.getCourseName());
//        System.out.println(bob + " for his " + course1.getCourseName() + " course.");

    System.out.println();

    System.out.println("Institution New Account Balance: £" + greenwich.getTotalMoneyEarned());

    System.out.println();

    System.out.println("--------------------COURSES--------------------");
    System.out.println(course1.getCourseName());
    System.out.println(course2.getCourseName());
    System.out.println(course3.getCourseName());
    System.out.println(course4.getCourseName());
}
}
