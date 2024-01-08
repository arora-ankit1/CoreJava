package Collections;
/*
* CHALLENGES WITH ARRAY
* 1. different data types can come.
* 2. size can vary.
* 3. Hetrogenous data types cannot be stored in same array.
* */
public class ArrayDemo {
    public static void main(String[] args) {
        int array[];
        double aaray[];
        String array3[];
        String name;
        array  = new int[9];
        for (int i = 0; i<9; i++) {
            array[i] = i;
        }
        int array2[] = {1,2,3,4,5};
        for (int i = 0; i<9; i++) {
            System.out.println(array[i]);
        }

    }
}
