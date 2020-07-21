package school.management.system;

import java.util.List;

public class Course {
    private String courseName;

    public Course(String CourseName) {
        this.courseName = CourseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

