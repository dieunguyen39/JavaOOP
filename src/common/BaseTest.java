package common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Open Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Close Browser: " + Constants.getBrowser());
    }
}
