package school.management.system.command;

public class AddStudentCommand {
    private String name;
    private int year;
    private String school;

    public AddStudentCommand(String name, int year, String school) {
        this.name = name;
        this.year = year;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getSchool() {
        return school;
    }
}
