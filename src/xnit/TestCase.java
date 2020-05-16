package xnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run() {
        try {
            Method method = getClass().getMethod(name); // Method 정보 불러오기 (name과 같은 이름을 가진 메소드를 클래스 내에서 가져온다.)
            method.invoke(this); // 가져온 메서드를 불러온다.
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
