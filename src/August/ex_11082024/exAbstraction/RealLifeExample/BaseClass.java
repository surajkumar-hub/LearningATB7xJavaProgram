package August.ex_11082024.exAbstraction.RealLifeExample;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation
    // We"ll use Single Inheritance
    // We"ll hide the functionality of the open and close browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);

    BaseClass(){}// concept of constructor is useless in-case of abstract

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }

}

// Abstract class can have complete method as well as incomplete methods
