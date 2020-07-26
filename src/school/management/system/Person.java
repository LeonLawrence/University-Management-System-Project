package school.management.system;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        setId(id);
        setName(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
