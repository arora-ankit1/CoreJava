package Collections.SetsDemo;

import java.util.HashSet;
/*
* HashSet:-
1. Introduced in 1.2 v
2. Duplicate objects are not allowed if we are trying to insert duplicate values then we won’t get
any compilation errors an won’t get any Execution errors simply add method return false.
3. Null insertion is possible
4. Heterogeneous objects are allowed
5. The under laying data structure is hashTable.
6. Insertion order is not preserved.*/

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("a");
        h.add("a");
        h.add("aaaa");
//        h.add(10);
//        h.add(null);
        h.add("abc");
        h.add("abcde");
        h.add("efg");
        h.add(null);
        // [a, aaaa, 10, null, abc]
        System.out.println(h);
    }
}
