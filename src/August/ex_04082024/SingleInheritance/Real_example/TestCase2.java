package August.ex_04082024.SingleInheritance.Real_example;

public class TestCase2 extends BaseTest{
    void testCase2()
    {
        startBrowser();// From BaseTest
        getDataFromSQL(); // From GrandBaseTest
        System.out.println(gold); // From GrandBaseTest

        /* We are able to call the above methods without object reference is because of "extends" keyword.
        If we don't use extends keyword, we can call this method in this way -
        new BaseTest().startBrowser();
        new GrandBaseTest().getDataFromSQL();
        new BaseTest().closeBrowser(); */

        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args)
    {
        new TestCase2().testCase2();
    }
}
