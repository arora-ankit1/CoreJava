package MyMethodsPackage;

public class Cuboid extends Shape implements ThreeD {

    double length, width, height;

    @Override
    void printDetails() {
        super.i = 0;

    }

    @Override
    double calculateArea() {
        return 2 * (length + width + height);
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    public void letsPrint() {

    }

}

class  MyCuboid extends Cuboid {
    @Override
    void printDetails() {
        System.out.println("My Cuboid");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
