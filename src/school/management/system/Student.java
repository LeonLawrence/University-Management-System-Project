package school.management.system;

public class Student {

    private int id;
    private String name;
    private int year;
    private int feesPaid;
    private int feesTotal;
    private String school;

    public Student(int id, String name, int year, String school) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.year = year;
        this.school = school;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
        return "STUDENT NAME: " + name + "          TOTAL AMOUNT PAID: £" + feesPaid;
    }
}
