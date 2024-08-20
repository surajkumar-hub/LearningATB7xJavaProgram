package August.ex_04082024.SingleInheritance.Real_example;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();// From BaseTest
        getDataFromSQL(); // From GrandBaseTest
        System.out.println(gold); // From GrandBaseTest
        // We can access both methods and variables by using extends keyword
        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
