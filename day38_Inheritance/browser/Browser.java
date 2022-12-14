package day38_Inheritance.browser;

public class Browser {
    private String BrowserName;

    public String getBrowserName() {
        return BrowserName;
    }

    public void setBrowserName(String browserName) {
        BrowserName = browserName;
    }

    public void openBrowser (){
       System.out.println(BrowserName + "opening chrome browser");
   }

   public void closeBrowser (){
       System.out.println(BrowserName + "closing chrome browser");
   }

    @Override
    public String toString() {
        return "Browser{" +
                "BrowserName='" + BrowserName + '\'' +
                '}';
    }

   /*1. Create a class named Browser:
Methods:
openBrowser(): prints "opening chrome
browser"
closeBrowser():  prints "closing chrome
browser"

         */
    }

