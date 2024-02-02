package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Glue paths are used to specify the packages or directories where Cucumber should look for step definitions and related classes.

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/FeatureFiles", //defines the features folder
        glue = { "Utils", "StepDef"}, //defines step definitions and utility folder
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"} //For reports
)
public class TestRunner {


}
