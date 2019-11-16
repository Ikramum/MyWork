package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )

@CucumberOptions(features="E:\\TestLeaf\\Selenium\\workspace\\SeleniumWork\\src\\main\\java\\featurefiles\\CreateLead.feature",glue="implementation",monochrome=true,tags="~@createLead")

public class RunCukes {

}
