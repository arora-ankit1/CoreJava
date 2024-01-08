package Collections.ListDemo;

import java.util.Iterator;
import java.util.LinkedList;

/*
* Class LinkedList extends AbstractSequentialList implements List,Deque,Queue
1) Introduced in 1.2 v
2) Duplicate objects are allowed
3) Null insertion is possible
4) Heterogeneous objects are allowed
5) The under laying data structure is double linked list.
6) Insertion order is preserved.
* */

public class LinkedListDemo {
    public static void main(String[] args)
    {
        moreDemo();
        /*LinkedList<String> l=new LinkedList<String>();
        l.add("a");
        l.add("abcd");
        l.add("anu");
        l.add("aaa");
        System.out.println(l);
        System.out.println(l.size());*/
    }

    public static void moreDemo() {
        LinkedList ll=new LinkedList();
        System.out.println(ll.size());
//add the elements to the LinkedList
        ll.add("a");
        ll.add(10);
        ll.add(10.6);
        ll.addFirst("mango");
        ll.addLast("tree");
       /* Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        for (int i =0; i< ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        String str[] = {"A","B","C"};
        System.out.println("original content :"+ll);
        System.out.println(ll.size());
//remove elements from LinkedList
        ll.remove(10.6);
        ll.remove(0);
        System.out.println("after deletion content :"+ll);
        System.out.println(ll.size());
//remove first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deletion of first and last :"+ll);
//get and set a value
        int a=(Integer)ll.get(0);
        ll.set(0,a+"ratan");
        System.out.println("ll after change:"+ll);
    }
}
