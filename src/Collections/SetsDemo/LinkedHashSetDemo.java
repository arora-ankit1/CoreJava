package Collections.SetsDemo;

import java.util.LinkedHashSet;
/*
*
* 1. Introduced in 1.4 v
  2. Duplicate objects are not allowed if we are trying to insert duplicate values then we wont get
    any compilation errors an won’t get any Execution errors simply add method return false.
* 3. Null insertion is possible
  4. Heterogeneous objects are allowed
5. The under laying data structure is linkedList & hashTable.
6. Insertion order is preserved.
7. It is a child class of HashSet.
* */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("a");
        h.add("a");
        h.add("aaaa");
        h.add(10);
        h.add(null);
        h.add("abc");
        h.add(null);
        System.out.println(h);
    }
}
