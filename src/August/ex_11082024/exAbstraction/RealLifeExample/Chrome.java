package August.ex_11082024.exAbstraction.RealLifeExample;

public class Chrome extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome ..... // This code is related to chrome only");
        return browser;
    }

    @Override
    String closeBrowser(String browser)
    {
        return "";
    }

}
