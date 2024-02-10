interface Interface1 {
    void method1();

    static void defaultMethod() {
        System.out.println("Default method of Interface1");
    }

    static void staticMethod() {
        System.out.println("Static method of Interface1");
    }
}

interface Interface2 {
    void method2();
}

interface Interface3 {
    void method3();
}

abstract class AbstractClass {
    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass implements Interface1, Interface2, Interface3 {
    @Override
    public void method1() {
        System.out.println("Method 1 of Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 of Interface2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 of Interface3");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method of AbstractClass");
    }
}

public class q24 {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.abstractMethod();
        Interface1.defaultMethod();
        Interface1.staticMethod();
    }
}