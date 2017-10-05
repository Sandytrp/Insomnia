package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Adminindia\\workspace\\Insomnia_Staging\\Feature\\feature.feature", glue = "stepDefination", tags ={"@Tag"} )
	
public class RunCukesTest {
}	