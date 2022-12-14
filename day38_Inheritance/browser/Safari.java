package day38_Inheritance.browser;

public class Safari extends Browser {
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
        4. Safari extends Browser
methods:
openBrowser():
prints "opening safari browser"
closeBrowser():
prints "closing safari browser"
         */

}
