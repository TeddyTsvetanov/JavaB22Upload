package day59_poly_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("Hi!");  //will show not supported
        link.getLinkHref();

        WebElement loginLink = new Link();   //will take only the methods inherited from WebElement
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref(); ERROR

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);
        //WebElementUtil.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
