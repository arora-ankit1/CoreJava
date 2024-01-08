package Collections.ListDemo;


import java.util.Enumeration;
import java.util.Vector;

/*
* Vector:- (legacy class introduced in 1.0 version)
1) Introduced in 1.0 v legacy classes.
2) Duplicate objects are allowed
3) Null insertion is possible
4) Heterogeneous objects are allowed
5) The under laying data structure is growable array.
6) Insertion order is preserved.
7) Every method present in the Vector is synchronized and hence vector object is Thread safe.
* */
public class VectorDemo {
    static Vector v=new Vector();
    public static void main(String[] args)
    {

        for (int i=0;i<10 ;i++ )
        {
            v.addElement(i);
        }
        System.out.println(v);
        v.addElement("rattaiah");
        System.out.println(v);
        v.removeElement(0);
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }

    public static void vectorEnumerationDemo() {
        Enumeration e = v.elements();
        int i= 0;
        while (e.hasMoreElements()) {
            ++i;
            System.out.println("Element "+i+"is"+e.nextElement());
        }
    }

}
