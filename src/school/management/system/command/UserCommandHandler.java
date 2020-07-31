package school.management.system.command;

import school.management.system.ManagementSystem;
import school.management.system.model.Student;
import school.management.system.view.StudentView;

public class UserCommandHandler {
    private ManagementSystem managementSystem;

    public UserCommandHandler(ManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }

    public StudentView handle(AddStudentCommand command) {
        Student student = managementSystem.addStudent(command.getName(),
                command.getYear(),
                command.getSchool());

        StudentView studentView = new StudentView(student);
        return studentView;
    }
}
