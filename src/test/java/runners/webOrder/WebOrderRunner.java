package runners.webOrder;
//runner class is a way to run all your feature files from here
//@RunWith annotation comes from jUnit it executes the feature file steps
//Cucumber options is a special annotation that have some keyWords
//features: this is the location of feature files(this one should be content root path)
//glue; IS A LOCATION OF STEP DEFINITIONS(should be source root path  and delete .java part to make it more general
//dryRun:is a way to get snips without executing the whole implementations.
//It means if you make it true, you will get immediately unimplemented snips

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.weborder/Order.feature", //this is path for feature files
        glue = "stepdefinitions/webOrderSteps", //this is path for stepDefinitions
        dryRun = false,
        tags = "@smoke"

)




public class WebOrderRunner {

}
