package August.ex_11082024.exAbstraction.RealLifeExample;

public class Firefox extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Firefox .....// This is code related to Firefox only");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Firefox .....// This is code related to Firefox only");
        return "";
    }

}
