package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber/cucumber.json"},
        //dryRun = true,
        monochrome = true,
        tags = "@P1"
)

public class TestRunner {


}
