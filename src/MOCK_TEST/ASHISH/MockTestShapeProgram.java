package MOCK_TEST.ASHISH;

public class MockTestShapeProgram {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[5];

        shapes[0] = new Rectangle(12, 17);
        shapes[1] = new Square(25);
        shapes[2] = new Circle(3.9);
        shapes[3] = new Rectangle(77, 35);
        shapes[4] = new Circle(7.5);

        for (Shapes shape : shapes) {
            shape.printDetails();
        }
    }
}
