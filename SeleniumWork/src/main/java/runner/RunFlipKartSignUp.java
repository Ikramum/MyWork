package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(features="E:\\TestLeaf\\Selenium\\workspace\\SeleniumWork\\src\\main\\java\\featurefiles\\LoginFlipKart.feature"
,glue= {"implementation"},
plugin= {"usage","html:target/cucumber-reports"},
monochrome=true
)

public class RunFlipKartSignUp {
	
	
	

}
