package school.management.system;

public class Student extends Person {

    private int year;
    private String school;
    private int feesPaid;
    private int feesTotal;

    public Student(String name, int year, String school) {
        super(name);
        this.year = year;
        this.school = school;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void payFees(int fees) {
        if (fees > 0) {
            feesPaid = feesPaid + fees;
            School.updateTotalMoneyEarned(feesPaid);
        }
    }

    public int getYear() {
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
        return "ID: " + getId() + "         " + getName() + "          TOTAL AMOUNT PAID: £" + feesPaid;
    }
}
