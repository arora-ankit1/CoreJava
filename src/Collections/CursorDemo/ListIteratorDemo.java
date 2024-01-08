package Collections.CursorDemo;

import java.util.ListIterator;
import java.util.Vector;

/*
* LIstIterator:-
1. It is applicable for only list type of objects.
2. By using this it is possible to read the data upate the data and delete data also.
3. By using listIterator() method we are getting LIstIterator object
* */
public class ListIteratorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        ListIterator litr = v.listIterator();
        while (litr.hasNext()) {
            Integer i = (Integer) litr.next();
            if (i == 0) {
                litr.add(90);
            }
            if (i == 5) {
                litr.set(100);
            }
            if (i == 9) {
                litr.remove();
            }
        }
        System.out.println(v);

        while (litr.hasPrevious()) {
            Integer i = (Integer) litr.previous();

            if (i < 9) {
                litr.set(2*i);
            }
            if (i > 9) {
                litr.set(i/2);
            }
            if (i == 1) {
                litr.remove();
            }
        }
        System.out.println(v);

    }
}
