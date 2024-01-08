import java.util.Arrays;

public class Welcome {
    public static void main(String[] args) {
        int num;
        num = 1;
        int alphaWaveSine = 10;
        float f = 0.1f;
        double d = 0.2;
        char c = 'A';
        short s = 1;
        byte b = 5;
        boolean flag;
        long l = 100000000000000000L;
        long newNum = num;
        short bigNum = 12009;
        byte bite = (byte) bigNum;
        short new_Num = (short) num;
//Implicit Typecasting when we are converting one Lower type to Higher type
//Explicit Typecasting when we are explicitly converting higher to lower type.
//        int ,short, byte, long

//      byte < short < int < long

        // float double
        // boolean
        // char
        // 2^8 = 256 (-ve) integer (+ve) integer
        // range of integers for byte -128...0.....+127
 /*   System.out.println(" Number num = "+num);
    System.out.println("Value of a = "+newNum);
        System.out.println("Value of byte = "+bite);
        System.out.println("Value of short = "+bigNum);*/
// byte _ _ _ _ _ _ _ _
        // short 1_0 _0 _1 _0 _1 _0 _0 _1     _ _ _ _ _ _ _ _ >>>>  <<<<

        int i = 2;
        double j = i--;
        char ch = (char) j;
        float fl = 5.0f;
        int _float = (int) fl;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("ch = " + ch);
        System.out.println("_float =" + ch);
    }

     private void main() {}
    public void main(String args) {}

    public static void main(int a) {}
}