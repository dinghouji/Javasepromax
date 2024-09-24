package single_instanse;

public class A {
    private static A a = new A();
    private A() {}
    public static A getInstance() {
        return a;
    }
}
