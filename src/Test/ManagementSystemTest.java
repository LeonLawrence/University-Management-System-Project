package Test;

import org.junit.Test;
import school.management.system.ManagementSystem;
import school.management.system.Person;
import school.management.system.Student;
import sun.awt.windows.WPrinterJob;

import static org.junit.Assert.assertEquals;

public class ManagementSystemTest {
    @Test
    public void canAddStudent() {
     ManagementSystem s = new ManagementSystem();
     s.addStudent("Leon", 2020, "UOG");
        assertEquals(true, s.getStudent());
    }
}
