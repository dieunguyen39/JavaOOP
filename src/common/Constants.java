package common;

public class Constants {
    public static String browser = "Chrome";
    public static boolean report = true;
    public static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }
}
