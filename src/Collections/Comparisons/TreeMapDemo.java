package Collections.Comparisons;

import java.util.TreeMap;
/*
* 1). The underlying data structure is RedBlack tree.
* 2). Duplicate Keys are not allowed, values can be Duplicated.
* 3). Insertion order is not preserved, it is based on some sorting order
*     Default Natural Sorting Order(DNSO) or Custom Sorting Order(CSO).
* 4). Heterogeneous Objects are not allowed as Keys otherwise we will get
*     ClassCastException.
* 5). For Values Heterogeneous Objects are allowed.
* 6). Null key are not allowed*/

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        String name = "NAME";
        String name2 = "NAMD";
        TreeMap<String,String> stringsMAp = new TreeMap<>();
        stringsMAp.put(name,"name");
        stringsMAp.put("ashish","abcd");
        stringsMAp.put("ASHISH","ABCD");
        stringsMAp.put("ZZ","ZZ");
        stringsMAp.put("123","123");
//        System.out.println(stringsMAp);
//        tm.put(null,"null");
        tm.put(-1,"-1");
        tm.put(1,"1");
        tm.put(0,"0");
        tm.put(300, "300");
        tm.put(800, "900");
        tm.put(400, "400");
        tm.put(900, "900");
        tm.put(500, "500");
        tm.put(700, "700");
        tm.put(200, "200");
        tm.put(600, "600");
        tm.put(100, "100");
        tm.put(900, "1000");
        System.out.println("firstKey() = "+tm.firstKey());
        System.out.println("tm.lastKey() = "+tm.lastKey());
        System.out.println("tm.headMap(200) = "+tm.headMap(201));
        System.out.println("tm.tailMap(400) = "+tm.tailMap(399));
        System.out.println("tm.subMap(200,400) = "+tm.subMap(200,400));
        System.out.println(tm);
    }

}
