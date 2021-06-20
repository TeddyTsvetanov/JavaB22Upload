package day55_abstraction.exercise_example.interface_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver opens up " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting browser");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon";
    }
}
