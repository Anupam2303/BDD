package Steps;


import Base.BaseUtil;
import Transfomation.EmailTransform;
import Transfomation.SalaryCountTransformer;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;


public class LoginStep extends BaseUtil {
    private String email;
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // System.out.println("The driver is : " + base.StepInfo);
        System.out.println("User form page");
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login Page");
        base.Device.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click Login");

    }

    @And("^I enter following details for login$")
    public void iEnterFollowingDetailsForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        /*List<List<String>> data = table.raw();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(data.get(i).get(j));
            }
        }*/
        // Create an array list
        List<User> Users = new ArrayList<User>();
        //Store all value of array list
        Users = table.asList(User.class);
        for (User user : Users) {
            System.out.println("User name is " + user.getUserName());
            System.out.println("password is " + user.getPassword());
        }


    }

    @And("^I enter ([^\"]*) and ([^\"]*) for login$")
    public void iEnterUsernameAndPasswordForLogin(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is " + username);
        System.out.println("Password is" + password);
    }

    @And("^I enter user email address as Email:([^\"]*)")
    public void iEnterUserEmailAddressAsEmailAdmin(String email) throws Throwable {
        this.email = email;
        // Write code here that turns the phrase above into concrete actions @Transform(EmailTransform.class)
        System.out.println("email address is " + email);
    }

    @And("^I verify the count of my salary digits for rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Salary digits count is " + salary);
    }

    public class User {
        private String userName;
        private String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }
}