package school.management.system;

public class People {

    protected static int id;
    protected static String name;
    protected static String role;

    public People(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;

    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static String getRole() {
        return role;
    }
}
