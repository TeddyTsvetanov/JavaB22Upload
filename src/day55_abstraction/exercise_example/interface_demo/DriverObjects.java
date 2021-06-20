package day55_abstraction.exercise_example.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        //WebDriver driver = new WebDriver(); // ERROR: cannot create object of Interface
        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("Title = " + driver1.getTitle() );

    }
}
