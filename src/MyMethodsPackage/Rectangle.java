package MyMethodsPackage;

public class Rectangle extends Shape {
    static double length;
    static double width;

    static {
        System.out.println("You are instantiating a rectangle.");
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return (length * width);
    }

    protected double calculatePerimeter() {
        return 2 * (length + width);
    }


    public static double compareAreas(Rectangle rect1, Rectangle rect2) {
        double largerArea = rect1.calculateArea();
        if (largerArea < rect2.calculateArea()) {
            largerArea = rect2.calculateArea();
        }
        return largerArea;
    }

    private static final void displayMessage() {
        System.out.println("Length = " + length + "\n" + "Width = " + width);
    }


    @Override
    void printDetails() {
        System.out.println("Ho ho ho, Merry Rectangle");
    }

    static class Square  {
         static double area = 0.0;
        public Square(double length, double width) {}

        public static double myArea() {
            return area;
        }
    }
}



