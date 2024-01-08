package Collections.ListDemo;
import java.util.*;
/*
* Stack:- (legacy class introduced in 1.0 version)
1) It is a child class of vector
2) Introduce in 1.0 v legacy class
3) It is designed for LIFO(last in fist order )*/
public class StackDemo {
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push("A");
        s.push(10);
        s.push("aaa");
        System.out.println(s);
//        s.pop();
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.peek());
        System.out.println("______________________________________________");
        Enumeration enumeration = s.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println(s);
    }
}
