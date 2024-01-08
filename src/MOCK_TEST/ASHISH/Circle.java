package MOCK_TEST.ASHISH;

class Circle implements Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle area : "+(3.14 * radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle perimeter : "+ 2 * 3.14 * radius);
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Circle");
        calculateArea();
        calculatePerimeter();

    }
}
