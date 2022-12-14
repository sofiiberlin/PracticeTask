package day38_Inheritance.browser;

public class Opera extends Browser{
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
        3. Opera extends Browser
methods:
openBrowser():
prints "opening opera browser"
closeBrowser():
prints "closing opera browser"
         */

}
