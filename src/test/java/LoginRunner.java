import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/login.feature",
        glue = {"steps"},monochrome = true
)
public class LoginRunner {
}
