package Collections.Comparisons;

import java.util.TreeSet;

public class EmployeeSystemTreeSetDemo {
    public static void main(String[] args) {
       TreeSet<Employee> employees = new TreeSet(/*new MyEmployeeComparator()*/);
        Employee dave = new Employee("Dave",103,"AEM");
        Employee nick = new Employee("Nick",102,"JVM");
        Employee jill = new Employee("Jill",105,"IOS");
        employees.add(new Employee("Sam",101,"OTT"));
        employees.add(nick);
        employees.add(dave);
        employees.add(new Employee("John",104,"AUS"));
        employees.add(jill);
        employees.add(new Employee("Joan",106,"ANDROID"));

        System.out.println("first() = "+employees.first());
        System.out.println("last() = "+employees.last());
        System.out.println("headSet(dave) = "+employees.headSet(dave));
        System.out.println("tailSet(dave) = "+employees.tailSet(dave));
        System.out.println("subSet(nick,jill) = "+employees.subSet(jill,nick));
        for (Employee e: employees) {
            System.out.println(e.toString());
        }




     }
}
