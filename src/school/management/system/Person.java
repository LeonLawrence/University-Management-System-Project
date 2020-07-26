package school.management.system;

public class Person {
    private static int count = 0;
    private int id;
    private String name;

    public Person(int id, String name) {
        setId(++count);
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


