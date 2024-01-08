package MOCK_TEST.ASHISH;

class Square implements Shapes {
    int side;

    Square(int side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area : "+(side * side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square perimeter : "+ 4 * (side));
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Square");
        calculateArea();
        calculatePerimeter();

    }
}
