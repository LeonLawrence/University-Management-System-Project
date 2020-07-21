package school.management.system;

import java.util.List;

public class Administrator {

    private List<Course> courses;

    public Administrator(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
