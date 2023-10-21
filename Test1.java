package MyTest;
import org.testng.annotations.Test;


public class Test1 extends TestBase {
    @Test
    public void validcases() throws InterruptedException {

        loginpage.OpenSite().to("https://the-internet.herokuapp.com/login");
        //driver.navigate().to("https://the-internet.herokuapp.com/login");

        loginpage.EnterUserName("tomsmith");
        //loginpage.username().sendKeys("tomsmith");
        //driver.findElement(By.name("username")).sendKeys("tomsmith");

        loginpage.EnterPassword("SuperSecretPassword!");
        //loginpage.password().sendKeys("SuperSecretPassword!");
        //driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        loginpage.ClickButton();
        //loginpage.LoginButton().click();
        //Assert.assertEquals(driver.findElement(By.id("flash")).getText(),"You logged into a secure area!");

        Thread.sleep(1000);
        TestIfTure.CheckIfMsgAppears();
        //Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area"));

    }


    @Test
    public void invalidUserName() {
        loginpage.OpenSite().to("https://the-internet.herokuapp.com/login");
        loginpage.EnterUserName("Invalid");
        loginpage.EnterPassword("SuperSecretPassword!");
        loginpage.ClickButton();
        TestIfTure.CheckInvalidMsg();

    }


    @Test
    public void invalidPassword() {
        loginpage.OpenSite().to("https://the-internet.herokuapp.com/login");
        loginpage.EnterUserName("tomsmith");
        loginpage.EnterPassword("Invalid!");
        loginpage.ClickButton();
        TestIfTure.CheckInvalidPass();
    }
}

