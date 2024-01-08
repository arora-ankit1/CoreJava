package Collections.ListDemo;

import java.util.*;

/*class ArrayList extends AbstractList implements List
the collection classes stores only objects but we are passing primitives these primitives are automatically
converts into objects is called autoboxing.
1) Introduced in 1.2 version.
2) ArrayList supports dynamic array that can be grow as needed.it can dynamically increase and
decrease the size.
3) Duplicate objects are allowed.
4) Null insertion is possible.
5) Heterogeneous objects are allowed.
6) The under laying data structure is growable array.
7) Insertion order is preserved.
10) 1.5 times the size of original array */

class ArrayListDemo {
    public static void main(String[] args) {
//        moreDemo();
        capacityDemo();
    }

    public static void capacityDemo() {
        ArrayList al = new ArrayList();

        al.add("a");
        al.add("A");
        al.add("a");
        al.add("Car");
        al.add("House");
        al.add(null);
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(13);
        al.add(1, "mango");
        System.out.println("Before Bazinga = "+al);
        al.add(19,"Bazinga");
        System.out.println("After Bazinga = "+al);
    }

    public static void arrayListDemo() {
        //creation of ArrayList
        ArrayList al = new ArrayList();
        Integer num1;

        int num2;

        System.out.println("initial size of the arraylist:" + al.size());
//adding elements to the ArrayList
        al.add("a");
        al.add("A");
        al.add("a");
        al.add("Car");
        al.add("House");
        al.add(null);
        al.add(10);
        al.add(1, "mango");
//print the ArrayList elements
        System.out.println(al);
        System.out.println("ArrayList size:" + al.size());

// add an array to collection
        ArrayList<Integer> all = new ArrayList<Integer>();
        all.add(1);
        all.add(2);
        all.add(3);

        al.addAll(all);
        System.out.println(al);

        //remove the elements of ArrayList
        al.remove(null);
        System.out.println("ArrayList size:" + al.size());
        System.out.println(al);
        Integer two = 2;
        al.remove(two);
        System.out.println(al);
        al.retainAll(all);
        System.out.println(al);
        all.retainAll(al);
        System.out.println(all);


    }

    public static void moreDemo() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);
        Integer[] a = new Integer[al.size()];
        al.toArray(a);
        int sum = 0;
        int arr;
        for (Integer element : a) {
            sum = sum + element;
            System.out.println(element);
        }
        System.out.println(sum);
    }
}