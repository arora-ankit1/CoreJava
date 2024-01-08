package Collections.Comparisons;

import java.util.TreeSet;

/* NOTE:
* 1). Heterogeneous objects are not allowed in TreeSet if we are trying to add
          Heterogeneous objects then we will get ClassCastException
  2). Null insertion is possible only once.
* 3). headSet(Object obj) returns SortedSet whose element are < obj
* 4). tailSet(Object obj) returns SortedSet whose element are >= obj
* 5). subSet(Object obj1, Object obj2) returns SortedSet whose element are >= obj1 and < obj2
*
* Null Acceptance
* 1). for the empty TreeSet if it has the first element we can insert null
*     but after inserting null we cant insert any other element or else we
*     will get NullPointerException
*
* 2). for non-empty TreeSet we can't insert null otherwise we will get  NullPointerException*/

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyIntegerComparator());
        ts.add(1);
//        ts.add(null);
        ts.add(10); // k1 <=> 10
        ts.add(0); // 10 >  0  [0,10]
        ts.add(5); // [0,10] => [0,5,10] .......
        ts.add(20);
        ts.add(15);
        System.out.println( ts.add(21));

        /*[0,5,10,15,20]*/
        System.out.println(ts);
    }
}
