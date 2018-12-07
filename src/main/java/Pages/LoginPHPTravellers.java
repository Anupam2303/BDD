package Pages;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.springframework.stereotype.Component;
import net.serenitybdd.core.pages.WebElementFacade;

@Component
@Data
public class LoginPHPTravellers extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/a")
    private WebElementFacade loginIcon;

    @FindBy(id = "inputEmail")
    private WebElementFacade userNameTextBox;

    @FindBy(id = "inputPassword")
    private WebElementFacade passwordTextBox;

    @FindBy(id = "login")
    private WebElementFacade loginButton;

    public void clickLoginIcon(){
        loginIcon.click();
    }

    public void enterUsername(String userName){
        userNameTextBox.sendKeys(userName);
    }

    public void enterPassword(String userName){
        passwordTextBox.sendKeys(userName);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
