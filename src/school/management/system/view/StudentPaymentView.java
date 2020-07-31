package school.management.system.view;

import school.management.system.model.Student;

public class StudentPaymentView {
    private Student student;

    public StudentPaymentView(Student student) {
        this.student = student;
    }

    public void displayStudentPayment() {
        System.out.println(student.getName() + " " + student.getFeesPaid());
    }
}
