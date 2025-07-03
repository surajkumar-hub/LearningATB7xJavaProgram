package August.ex_10082024;

public class RealTimeInheritance {
    public static void main(String[] args)
    {
        BaseClass t1 = new TestCase1(); // Dynamic Dispatch // Runtime
        //t1.setBrowser("opera",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

class TestCase1 extends BaseClass{
    // TestCase is A Type of Base class - Single Inheritance
    TestCase1()
    {
        super(); // Can call DC of Parent
        this.setBrowser("edge",true); // It"ll call function of this class
    }

    @Override
    public void setBrowser(String browser, boolean isAuth)
    {
        super.setBrowser(browser, isAuth);
    }
}

class   BaseClass{
    BaseClass()
    {
        System.out.println("DC - BaseClass");
    }
    BaseClass(String b)
    {
        System.out.println("PC - BaseClass");
    }

    private String browser;

    public String getBrowser()
    {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth)
    {
        if (isAuth)
        {
            this.browser = browser;
        }else
        {
            System.out.println("Not Allowed");
        }
    }
    // If user doesn't enter any browser name this browser will start
    void openBrowser()
    {
        System.out.println("Chrome Browser!!");
    }
    // If user enters any specific browser name that browser will start
    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser!!");
    }

}

/* Dynamic Dispatch means when we use parent class reference while creating child class object.
It basically says - We can have a son object assigned to the father reference but father reference can
only access common or overridden functions. */

/* Note: We can't create a default constructor in child class if parent class doesn't have a default
constructor. If child class is using a default constructor then parent class should have a default constructor
 */

/* Ex:
public class Programming{
    String version;

    Programming(String version) {
        System.out.println("Programming Language");
    }
}

public class Python extends Programming{
    Python(){
        super("version2");
        System.out.println("Python IS-A type of programming language");
    }
} */