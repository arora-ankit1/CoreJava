package MyMethodsPackage;

public class Parent {

    private void myFun() {}
    public void tooMuchFun() {}
}

class Child extends Parent {
    @Override
    public void tooMuchFun() {
        super.tooMuchFun();
    }
}