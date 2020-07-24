package school.management.system;

import java.time.Year;

public class Student extends People {

    protected int year;
    protected String school;

    public Student(int year, String school) {
        super(0, null, null);
        this.year = year;
        this.school = school;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "**STUDENT DETAILS**\n" + "ID: "+ id + "\nNAME: " + name + "\nROLE: " + role + "\nSTATUS: " + year + "\nSCHOOL: " + school;

    }
}
