package Collections.MapDemo;

import java.util.*;
//"NATURAL SORTING ORDER "
/*STRING
A
AA
AB
ABC.....

INTEGER
1
2
3
4
5
6
11
23......

CUSTOM SORTING ORDER
your choice
ASCENDING ,DESCENDING ,DIVISIBLE BY two.....
* */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap h = new LinkedHashMap();
        h.put("sambha", 100);
        h.put("veeru", 100);
        h.put("gabbar", 100);

        System.out.println("LinkedHashMap => " + h);
        Set s = h.keySet();
        System.out.println("KeySet => " + s);
        Collection c = h.values();
        System.out.println("Values => "+c);
        Set s1 = h.entrySet();
        System.out.println("EntrySet => "+s1);
        for (Object o : s1) {
            Map.Entry m1 = (Map.Entry) o;
            System.out.println(m1.getKey() + "------" + m1.getValue());
            if (m1.getKey().equals("sambha")) {
                m1.setValue("kalia");
            }
        }
        System.out.println(s1);
    }
}

