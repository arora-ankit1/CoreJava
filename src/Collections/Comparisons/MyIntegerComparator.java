package Collections.Comparisons;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
//        return i1.compareTo(i2); // ascending order
//        return i2.compareTo(i1); // descending order
        return -i1.compareTo(i2); // descending order
//        return 1; // reverse order of insertion
    }
}
