package MOCK_TEST.ASHISH;

class Rectangle implements Shapes {
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area : "+(length*breadth));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle perimeter : "+ 2 * (length+breadth));
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Rectangle");
        calculateArea();
        calculatePerimeter();

    }
}