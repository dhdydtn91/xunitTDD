package xnit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void setUp() {
        WasRun wasRun = new WasRun("testMethod");
    }

    public void testRunning () { //테스트
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();//wasRun true로 변환
        Assert.assertEquals(true, wasRun.wasRun);
    }

    public void testSetup() {
        Assert.assertEquals(false, wasRun.wasSetUp);
        wasRun.run();//wasSetUp true로 변환
        Assert.assertEquals(true, wasRun.wasSetUp);
    }

}
