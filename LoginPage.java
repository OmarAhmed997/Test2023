package MyTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

/*
    WebDriver driver = null;                       //intialize the driver

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
*/
    public void EnterUserName(String username)
    {
        TestBase.driver.findElement(By.id("username")).sendKeys(username);
    }
/*
    public WebElement username ()
    {
        return driver.findElement(By.id("username"));
    }
*/
    public void EnterPassword (String password)
    {
        TestBase.driver.findElement(By.id("password")).sendKeys(password);
    }
/*
    public WebElement password ()
    {
        return driver.findElement(By.id("password"));
    }
*/

    public WebDriver.Navigation OpenSite ()
    {
        return TestBase.driver.navigate();
    }

    public void ClickButton()
    {
        TestBase.driver.findElement(By.xpath("//button[@type = 'submit' ]")).click();
    }
/*
    public WebElement LoginButton ()
    {
        return driver.findElement(By.xpath("//button[@type = 'submit' ]"));
    }
*/
}
