package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        System.out.println("System redirected to particular URL :Firefox");

        //Passing a dummy Webdriver Instance
//        base.StepInfo = "FirefoxDriver";
        System.setProperty("webdriver.gecko.driver", "C:\\Learning\\geckodriver.exe");
        Device = new FirefoxDriver();
    }

    @After
    public void TearDownTest(Scenario scenerio) {
        System.out.println("Closing browser : MOCK");
        System.out.println(scenerio.getName());
    }
}
