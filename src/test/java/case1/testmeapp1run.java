package case1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/case1/testmeapp1.feature",
glue="case1",
plugin="json:target\\jsonReport.json")
public class testmeapp1run {

}
