package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    private String placeOfWork;

    public Teacher(int id, String name, int salary, String placeOfWork) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
        this.placeOfWork = placeOfWork;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned = salaryEarned + salary;
        School.updateTotalMoneySpent(salary);
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Override
    public String toString() {
        return "TEACHER NAME: " + name + "          TOTAL SALARY EARNED £" + salaryEarned;
    }
}
