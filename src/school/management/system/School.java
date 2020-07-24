package school.management.system;


import java.util.ArrayList;
import java.util.List;

public class School {

    private List<People> peoples;
    private List<Teacher> teachers;
    private List<Student> students;

    public School() {
        this.peoples = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    //--------------------------------------------------------------------------------------------------------------
    public List<People> getPerson() {
        return peoples;
    }

    public void setPerson(People person) {
        peoples.add(person);
    }
    //--------------------------------------------------------------------------------------------------------------
    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    //--------------------------------------------------------------------------------------------------------------
    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(Student student) {
        students.add(student);
    }
}