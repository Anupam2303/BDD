package Steps;

import Base.BaseUtil;
import Pages.LoginPHPTravellers;
import Webproperties.WebProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Data
@Component
public class LoginPhpTravellersSteps {
    @Autowired
    private WebProperties webProperties;
    @Autowired
    private LoginPHPTravellers loginPHPTravellers;

    WebDriver driver = new ChromeDriver();

    @Given("^Where URL is '(.*)'$")
    public void whereURLIsHttpsPhptravelsOrgClientareaPhp(String URL) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Personal/Drivers/chromedriver");
        driver.get(URL);
        Actions builder = new Actions(driver);
        builder.clickAndHold(loginPHPTravellers.getLoginIcon()).moveToElement(loginPHPTravellers.getPasswordTextBox())
                .release(loginPHPTravellers.getLoginIcon()).build().perform();
        builder.doubleClick();
        builder.moveToElement();
        builder.contextClick().build().perform();
    }

    @When("^userName is '(.*)' and password is '(.*)'$")
    public void usernameIsAnupamraiAndPasswordIsAnupamrai(String userName, String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("^Click login button$")
    public void clickLoginButton() throws Throwable {
        driver.findElement(By.id("login")).click();
    }

    @Then("^Verify User is login$")
    public void verifyUserIsLogin() throws Throwable {

    }

    @And("^Logout buttin should be enabled$")
    public void logoutButtinShouldBeEnabled() throws Throwable {

    }


}
