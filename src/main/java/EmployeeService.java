/**
 * Created by wjia on 1/7/15.
 */
public class EmployeeService {
    public int getEmployeeCount() {
        return Employee.count();
    }

    public boolean giveIncrementToAllEmployeesOf(int percentage) {
        try {
            Employee.giveIncrementOf(percentage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
