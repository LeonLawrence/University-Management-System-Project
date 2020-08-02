package school.management.system.model;

import school.management.system.School;

public class Student extends Person {

    private String year;
    private String school;
    private int feesPaid;
    private int feesTotal;

    public Student(String name, String year, String school) {
        super(name);
        this.year = year;
        this.school = school;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void payFees(int fees) {
        if (fees > 0) {
            feesPaid = feesPaid + fees;
            School.updateTotalMoneyEarned(feesPaid);
        }
    }

    public String getYear() {
        return year;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "     name: " +
                getName() + "     Age: " + getYear() +
                "     School Name: " + getSchool() +
                "          TOTAL AMOUNT PAID: £" + feesPaid;
    }
}
