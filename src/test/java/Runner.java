import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = "stepdef",
        plugin = {"pretty"},
        monochrome = true,
        dryRun = true,
        stepNotifications = true,
        tags = "@openAPI"
)

public class Runner {

}