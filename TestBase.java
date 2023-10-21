package MyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class TestBase {
    public static WebDriver driver= null;               //static 34an kolo y2dr y8ier fee
    LoginPage loginpage= null;
    TestAssertions TestIfTure ;

    SoftAssert softAssert = new SoftAssert();



    @BeforeTest
    public void BeforeTest() {
        driver = new EdgeDriver();
        loginpage = new LoginPage();            //Instantiate the .Test1.LoginPage class
        TestIfTure = new TestAssertions();
        softAssert.assertAll();   // el m5zan bta3i..
    }

    @AfterTest
    public void QuitWeb() {
        driver.quit();
    }
}