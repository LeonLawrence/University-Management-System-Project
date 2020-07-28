package Test;

import org.junit.Test;
import school.management.system.Teacher;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    private Teacher me = new Teacher("Binh", 0, "London University");

    @Test
    public void canGetId() {
        assertEquals(1, me.getId());
    }

    @Test
    public void canGetName() {
        assertEquals("Binh", me.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(0, me.getSalary());
    }

    @Test
    public void canGetPlaceOfWork() {
        assertEquals("London University", me.getPlaceOfWork());
    }

    @Test
    public void canSetSalary() {
        assertEquals(0, me.getSalary());
        me.setSalary(500);
        assertEquals(500, me.getSalary());
    }

    @Test
    public void canSetPlaceOfWork() {
        assertEquals("London University", me.getPlaceOfWork());
        me.setPlaceOfWork("Greenwich University");
        assertEquals("Greenwich University", me.getPlaceOfWork());
    }

    @Test
    public void haveToString() {
        String name = me.getName();
        int salaryEarned = me.getSalary();
        String expected = "TEACHER NAME: " + name + "          TOTAL SALARY EARNED £" + salaryEarned;
        assertEquals(expected, me.toString());
    }

    @Test
    public void canReceiveSalary() {
        me.receiveSalary(0);
        assertEquals(0, me.getSalary());
        me.setSalary(10_000);
        assertEquals(10_000, me.getSalary());
    }
}


