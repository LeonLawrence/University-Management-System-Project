package Test;

import org.junit.Before;
import org.junit.Test;
import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SchoolTest {

    @Before
    public void setUp() {
        School.moneyReset();
        System.out.println("Start Test");
    }

    @Test
    public void canGetTotalMoneyEarned() {
        assertEquals(0, School.getTotalMoneyEarned());
    }

    @Test
    public void canGetTotalMoneySpent() {
        School.updateTotalMoneySpent(100);
        assertEquals(-100, School.getTotalMoneySpent());
    }

    @Test
    public void canUpdateTotalMoneySpent() {
        School.updateTotalMoneySpent(200);
        assertEquals(-200, School.getTotalMoneySpent());
    }

    @Test
    public void canUpdateTotalMoneyEarned() {
        School.updateTotalMoneyEarned(100);
        assertEquals(100, School.getTotalMoneyEarned());
    }

    @Test
    public void canAddStudent() {
        School school = new School();
        assertEquals(0, school.getStudents().size());
        assertEquals(0, school.getTeachers().size());
        school.addStudent(new Student(1, "Leon", 2020, "your"));
        assertEquals(1, school.getStudents().size());
        school.addTeacher(new Teacher(1, "Leon", 2020, "your"));
        assertEquals(1, school.getTeachers().size());
    }

    @Test
    public void canGetStudent() {
        School school = new School();
        assertEquals(0, school.getStudents().size());
    }
}
