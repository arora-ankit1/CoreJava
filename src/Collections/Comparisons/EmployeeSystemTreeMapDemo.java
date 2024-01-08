package Collections.Comparisons;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeSystemTreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Employee,Integer> employees = new TreeMap(new MyEmployeeComparator());
        Employee dave = new Employee("Dave",103,"AEM");
        Employee nick = new Employee("Nick",102,"JVM");
        Employee jill = new Employee("Jill",105,"IOS");
        employees.put(new Employee("Sam",101,"OTT"),101);
        employees.put(nick,102);
        employees.put(dave,103);
        employees.put(new Employee("John",104,"AUS"),104);
        employees.put(jill,105);
        employees.put(new Employee("Joan",106,"ANDROID"),106);

        System.out.println("first() = "+employees.firstEntry());
        System.out.println("last() = "+employees.lastEntry());
        System.out.println("headMap(dave) = "+employees.headMap(dave));
        System.out.println("tailMap(dave) = "+employees.tailMap(dave));
        System.out.println("subMap(nick,jill) = "+employees.subMap(nick,jill));
        for (Map.Entry e: employees.entrySet()) {
            System.out.println(e.getKey().toString());
        }
    }
}
