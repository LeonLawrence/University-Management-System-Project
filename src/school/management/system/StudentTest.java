package school.management.system;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student me = new Student(1, "Binh", 2020, "some-school");

    @Test
    public void canGetStudentId() {
        assertEquals(1, me.getId());
    }

    @Test
    public void canGetStudentName() {
        assertEquals("Binh", me.getName());
    }

    @Test
    public void canGetYear() {
        assertEquals(2020, me.getYear());
    }


    @Test
    public void canFeeToPay() {
        assertEquals(30_000, me.getRemainingFees());
        me.payFees(10_000);
        assertEquals(20_000, me.getRemainingFees());
    }

    @Test
    public void canGetFeesTotal() {
        me.payFees(30_000);
        assertEquals(30_000, me.getFeesTotal());
    }

    @Test
    public void canGetCurrentYear() {
        assertEquals(2020, me.getYear());
        me.setYear(2021);
        assertEquals(2021, me.getYear());
    }

    @Test
    public void payNegativeFee() {
        Student me = new Student(1, "Binh", 2020, "some-school");
        me.payFees(-10_000);
        assertEquals(30_000, me.getRemainingFees());
    }

    @Test
    public void canSetSchool() {
        assertEquals("some-school", me.getSchool());
        me.setSchool("some-other-school");
        assertEquals("some-other-school", me.getSchool());
    }

    @Test
    public void haveToString() {
        String name = me.getName();
        int feesPaid = me.getFeesPaid();
        String expected = "STUDENT NAME: " + name + "          TOTAL AMOUNT PAID: £" + feesPaid;
        assertEquals(expected, me.toString());
    }
}