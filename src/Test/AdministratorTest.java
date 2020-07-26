package Test;

import org.junit.Test;
import school.management.system.Administrator;
import school.management.system.Course;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdministratorTest {

    @Test
    public void canGetCourse() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Maths"));
        Administrator subject = new Administrator(courses);
        assertEquals("Maths", subject.getCourses().get(0).getCourseName());
    }

    @Test
    public void canAddCourse() {
        List<Course> courses = new ArrayList<>();
        Administrator subject = new Administrator(courses);
        subject.addCourse(new Course("Magic"));
        assertEquals("Magic", subject.getCourses().get(0).getCourseName());
    }
}


