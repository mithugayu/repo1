package case3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/case3/testmeapp3.feature",
glue="case3",
plugin="json:target\\jsonReport.json")
public class testmeapp3run {

}
