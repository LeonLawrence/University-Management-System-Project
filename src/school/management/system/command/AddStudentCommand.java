package school.management.system.command;

public class AddStudentCommand {
    private String name;
    private String year;
    private String school;

    public AddStudentCommand(String name, String year, String school) {
        this.name = name;
        this.year = year;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getSchool() {
        return school;
    }
}
