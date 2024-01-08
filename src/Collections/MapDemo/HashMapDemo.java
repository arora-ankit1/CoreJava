package Collections.MapDemo;

import Collections.Comparisons.Employee;
/* Collection Vs Collections
* */

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("sambha", 100);
        h.put("veeru", 100);
        h.put("gabbar", 100);
        h.put(100,"hijk");
//        h.put("new","asd");
        System.out.println("HashMap => " + h);
        Set s = h.keySet();
        System.out.println("KeySet => " + s);
        Collection c = Arrays.asList(h.values().toArray());
        List al =  Arrays.asList(h.values().toArray());
        System.out.println("Values => "+al);
        System.out.println("To Array =>"+h.values().toArray().length);
        Set<Map.Entry> s1 = h.entrySet();
        System.out.println("EntrySet => "+s1);
        System.out.println("h.get(\"veeru\") => "+h.get("veer"));
        System.out.println("h.containsKey(\"gabbar\") => "+h.containsKey("gabbar"));
        System.out.println("h.containsValue(101) => "+h.containsValue(101));
        for (Map.Entry o : s1) {
//            Map.Entry m1 = (Map.Entry) o;
            System.out.println(o.getKey() + "------" + o.getValue());
            if (o.getKey().equals("sambha")) {
                o.setValue("kalia");
            }

           /* ArrayList<Employee> alll = new ArrayList<>();
            for (Object employee: alll) {
                Employee employee1 = (Employee) employee;
                System.out.println(employee1.getEmpID()+ employee1.getDepartment());
                if (employee1.getEmpID() == 100) {
                    employee1.setDepartment("CEO");
                }
            }*/
        }
        System.out.println(s1);
    }
}
