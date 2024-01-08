package Collections.CursorDemo;

import java.util.Iterator;
import java.util.Vector;
/*
* Iterator:-
1. it is universal cursor we can apply any type of collection class.
2. By using this it is possible to read the data and remove the data.
3. We can use iterator() method to get the iterator object.
* */
public class IteratorDemo {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        for (int i=0;i<10 ;i++ )
        {
            v.addElement(i);
        }
        System.out.println(v);
        Iterator itr=v.iterator();
        while (itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            if (i%2==0)
            {
                System.out.println(i);
            }
            else
                itr.remove();

        }
        System.out.println(v);
    }
}

/*
Limitations of Iterator
1. By using iterator we can perform read and remove operation only but not addition or replacement.
2. We can read elements only in forward direction not backward direction.
* */
