package Test;

import org.junit.Test;
import school.management.system.Course;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    @Test
    public void canGetCourseName() {
        Course subject = new Course("Maths");
        assertEquals("Maths", subject.getCourseName());
    }

    @Test
    public void canSetCourseName() {
        Course subject = new Course("Maths");
        assertEquals("Maths", subject.getCourseName());
        subject.setCourseName("Science");
        assertEquals("Science", subject.getCourseName());
    }
}
