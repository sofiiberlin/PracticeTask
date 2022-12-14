package day38_Inheritance.browser;

public class FireFox extends Browser{
    @Override
    public String getBrowserName() {
        return super.getBrowserName();
    }

    @Override
    public void setBrowserName(String browserName) {
        super.setBrowserName(browserName);
    }

    @Override
    public void openBrowser() {
        super.openBrowser();
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }


    /*
        2. FireFox extends Browser
methods:
openBrowser():
prints "opening firefox browser"
closeBrowser():
prints "closing fire fox browser"
         */

}
