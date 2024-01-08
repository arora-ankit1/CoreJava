import MyMethodsPackage.Method;
import MyMethodsPackage.Rectangle;

public class Call {
    public static void main(String[] args) {
        Method.main();
        Method.main(1);
        Method.main(new String[]{""});
//        Rectangle rectangle = new Rectangle(4,5);
//        rectangle.calculatePerimeter();
    }
}
