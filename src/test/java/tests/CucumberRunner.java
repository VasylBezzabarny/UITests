package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.BeforeClass;
import org.junit.AfterClass;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"}, features = "src/test/resources"
)
public class CucumberRunner {

}
