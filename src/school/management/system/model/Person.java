package school.management.system.model;

import school.management.system.IdGenerator;

public class Person {
    private int id;
    private String name;

    public Person(String name) {
        this.id = IdGenerator.getId();
        this.name = name;
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


