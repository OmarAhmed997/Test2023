package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TestAssertions extends TestBase {
    //Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area"));
    public void CheckIfMsgAppears() {
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area"));
    }


    public void CheckInvalidMsg() {
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"), "this is Hard assertion 1");
    }

        public void CheckInvalidPass()
        {
            Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your password is invalid!"), "this is hard");

        }

}

