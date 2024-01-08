package MyMethodsPackage;

public class MathOperations {

    static {
        System.out.println("Static block loaded");
    }
    public int calculateSquare(int num) {
        return num * num;
    }

    public double calculateSquare(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        MathOperations operations1 = new MathOperations();
        operations.calculateSquare(4);
        System.out.println(operations.calculateSquare(4));
        Rectangle rectangle = new Rectangle(4,3);
        rectangle.length = 4;
        rectangle.width = 3;
        System.out.println(rectangle.calculateArea());
        Rectangle rectangle1 = new Rectangle(5,4);
        rectangle1.length = 5;
        rectangle1.width = 4;
        System.out.println("Greater area is = "+Rectangle.compareAreas(rectangle1,rectangle));

        Shape shape = new Shape() {
            @Override
            void printDetails() {
                System.out.println("My New Shape");
            }
        };


    /*    Rectangle rec = new Rectangle(3,4);
        rec.calculatePerimeter();*/


//        Rectangle.Square mySquare = new Rectangle.Square(2,2);
        Rectangle.Square.myArea();
        Rectangle.Square.area = 4.0;

    }
}
