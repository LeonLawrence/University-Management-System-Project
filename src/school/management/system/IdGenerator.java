package school.management.system;

public class IdGenerator {
    private static int counter = 0;

    public static int getId() {
        counter++;
        return counter;
    }
}
