package case4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/case4/testmeapp4.feature",
glue="case4",
plugin="json:target\\jsonReport.json")
public class testmeapp4run {

}
