package SeparatePackage;


import MyMethodsPackage.Method;


public class MethodCall {
    public static void main(String[] args) {
        Method method = new Method();
        method.message();
    }

}