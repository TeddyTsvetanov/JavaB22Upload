package day34_void_method;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test --");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---ETSY Search Smoke Test Completed---");
    }

    public static void openBrowser(){
        System.out.println("Launching Chrome Browser");
    }

    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }

    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search results are successfully displayed.");
        System.out.println("\t Actual picture of wooden spoon is displayed");
    }

}
