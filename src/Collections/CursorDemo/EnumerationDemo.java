package Collections.CursorDemo;

import java.util.Enumeration;
import java.util.Vector;

/*
* Enumaration:-
1. It is used for only legacy classes(Vector,Stack)
2. Based on above reason the enumeration cursor is not a universal cursor
3. By using this cursor it is possible to read the data only it not possible to update the data an not
possible to delete the data.
4. By using elements method we are getting enumaration object.
* */

public class EnumerationDemo {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        for (int i=0;i<10 ;i++ )
        {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements());
        {
            Integer i=(Integer)e.nextElement();
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println(v);
    }
}
