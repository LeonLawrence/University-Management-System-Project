package school.management.system;

<<<<<<< Updated upstream
public class Teacher extends People{
=======
public class Teacher extends Person {
>>>>>>> Stashed changes

    protected String workStatus;

    public Teacher(String workStatus) {
        super(0, null, null);
        this.workStatus = workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }
    public String getWorkStatus() {
        return workStatus;
    }

    @Override
    public String toString() {
        return "**TEACHER DETAILS**\n" + "ID: "+ id + "\nNAME: " + name + "\nROLE: " + role + "\nSTATUS: " + workStatus;

    }
}
