package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSteps {
    static EdgeDriver driver;
    static  {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    @Given("^a browser is open$")
    public void a_browser_is_open() throws Throwable {
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        System.out.println("hello");
    }
}
