package xnit;

public class XUnitTest {
    public static void main(String[] args) {
            // 실행 할때마다 객체를 만들어서 테스트를 분리한다.
       TestSuite suite = TestCaseTest.suite();
       TestResult result = new TestResult();
       suite.run(result);
       System.out.println(result.getSummary());

    }
}
