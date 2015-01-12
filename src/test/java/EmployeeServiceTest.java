import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
public class EmployeeServiceTest {

    @Test
    public void shouldReturnTheCountOfEmployeesUsingTheDomainClass() {
        PowerMockito.mockStatic(Employee.class);
        PowerMockito.when(Employee.count()).thenReturn(900);

        EmployeeService employeeService = new EmployeeService();
        assertEquals(900, employeeService.getEmployeeCount());
    }

    @Test
    public void
    shouldReturnTrueWhenIncrementOf10PercentageIsGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);

        PowerMockito.doNothing().when(Employee.class);
        Employee.giveIncrementOf(10);

        EmployeeService employeeService = new EmployeeService();
        assertTrue(employeeService.
                giveIncrementToAllEmployeesOf(10));
    }

    @Test
    public void
    shouldReturnFalseWhenIncrementOf10PercentageIsNotGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);

        PowerMockito.doThrow(new IllegalStateException()).
                when(Employee.class);

        Employee.giveIncrementOf(10);

        EmployeeService employeeService = new EmployeeService();
        assertFalse(employeeService.
                giveIncrementToAllEmployeesOf(10));
    }
}