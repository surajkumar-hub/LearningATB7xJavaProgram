package August.ex_11082024.exAbstraction.RealLifeExample;

public class Lab172 {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");

        Firefox f = new Firefox();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenShot();
    }
}
