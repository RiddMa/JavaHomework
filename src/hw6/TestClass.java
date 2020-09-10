package hw6;

public class TestClass {
    public static void main(String[] args) {
        newClass nc = new newClass();
        System.out.println(nc.method());
        System.out.println(nc.method(1));
        System.out.println(nc.method(1,2));
        System.out.println(nc.method(1,2,3));
        System.out.println(nc.method(1,2,3,4));
    }
}
