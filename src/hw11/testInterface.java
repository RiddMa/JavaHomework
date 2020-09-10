package hw11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class testInterface {
    interface TestInterface {
        int data = 1;
        void test();
    }

    public static void main(String[] args) {
        try {
            Class obj = TestInterface.class;
            Field field = obj.getField("data");
            System.out.println("interface field: " + Modifier.toString(field.getModifiers()));
            Method method = obj.getMethod("test", null);
            System.out.println("method: " + Modifier.toString(method.getModifiers()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
