package testcases;

import common.BaseTest;
import common.Constants;

public class TestCase extends BaseTest {
    String url = "https://cms.anhtester.com/";
    public void loginCMS(){
        createDriver();
        Constants.setBrowser("Microsoft Edge");
        System.out.println("Step to login fail");
        System.out.println("1. Navigate to url: " + url + "login");
        System.out.println("2. Input email: " + "fail@example.com");
        System.out.println("3. Input password: " + "123456");
        System.out.println("4. Click on Login button" + "\n" + "5. Verify redirect to admin page");
        System.out.println("=> \"" + "Email or password is incorrect" + "\" error message is displayed\n");

        System.out.println("Step to login success");
        System.out.println("1. Navigate to url: " + url + "login");
        System.out.println("2. Input email: " + "admin@example.com");
        System.out.println("3. Input password: " + "123456");
        System.out.println("4. Click on Login button" + "\n" + "5. Verify redirect to admin page");
        System.out.println("=> \"" + "Login successfully" + "\" text message is displayed and Navigate to Admin page");
        closeDriver();
        System.out.println("\n");
    }

    public void addCategory(){
        createDriver();
        Constants.setBrowser("Firefox");
        System.out.println("1. Navigate to url: " + url + "addcategory");
        System.out.println("2. Clicks on the Products menu");
        System.out.println("3. Clicks on the Category menu");
        System.out.println("4. Clicks on the Add New category button");
        System.out.println("5. Input all fields on the form to create new category");
        System.out.println("6. Clicks on the Save button");
        System.out.println("7. Verify that New Category is added successfully");
        System.out.println("=> \"" + "Category is added successfully" + "\" text message is displayed and Navigate to Category List screen");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCase testCase = new TestCase();
        testCase.loginCMS();
        testCase.addCategory();
    }
}