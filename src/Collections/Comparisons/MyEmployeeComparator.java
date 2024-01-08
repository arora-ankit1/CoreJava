package Collections.Comparisons;

import java.util.Comparator;

public class MyEmployeeComparator implements Comparator {
    // [o1,o2,o3,o4,o5,o6,o7,o8,o9]
    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        return emp1.getEmpID() - emp2.getEmpID();
    }

}
