package MyMethodsPackage;

public class Method {

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    private String var1;
    private int var2;


    public static void main(String[] args,int i) {
//
    }

    public static void main() {
        System.out.println("main method with public access modifier ");
    }

    protected static void main(int args) {
        System.out.println("main method with protected access modifier ");
    }

    private static void main(int[] args) {
        System.out.println("main method with private access modifier ");
    }

    public static void main(String[] args) {
        main(new int[]{1, 2});
    }

    public static void main(double... args) {
//        return 1.0;
        for (int i = 0; i < args.length; i++)
            System.out.println("value at " + i + 1 + " = " + args[i]);
    }

    public void message() {
        System.out.println("SFSDSDFDFS");
    }
}
