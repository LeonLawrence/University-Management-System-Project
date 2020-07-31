package school.management.system.view;

import school.management.system.model.Student;

public class StudentView {
    private Student student;

    public StudentView(Student student) {
        this.student = student;
    }

    public void displayStudentDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("studentID: ").append(student.getId());
        builder.append("\n");
        builder.append("studentName: ").append(student.getName());
        String s = builder.toString();
        System.out.println(s);
    }
}
