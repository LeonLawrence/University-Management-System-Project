package school.management.system;

import school.management.system.model.Student;
import school.management.system.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Course> courses;
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;

    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        courses.add(course);
    }


    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned = totalMoneyEarned + MoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent = totalMoneyEarned - moneySpent;
    }

    public static void moneyReset() {
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
}