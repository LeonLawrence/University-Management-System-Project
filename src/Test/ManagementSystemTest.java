package Test;

import org.junit.Test;
import school.management.system.ManagementSystem;
import school.management.system.model.Student;

import static org.junit.Assert.assertEquals;

public class ManagementSystemTest {
    @Test
    public void canAddStudent() {
        ManagementSystem s = new ManagementSystem();
        Student student = s.addStudent("Leon", 2020, "UOG");
        assertEquals("Leon", student.getName());
        assertEquals(2020, student.getYear());
        assertEquals("UOG", student.getSchool());
    }

    @Test
    public void canAddCourse() {


    }

}
