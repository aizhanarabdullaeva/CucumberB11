package stepdefinitions.webOrderSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverHelper;

public class hookWebOrder {
    @Before
    public void beforeScenario(){
        System.out.println("It runs before each scenario");
    }
    @After
    public void afterScenario(){
       DriverHelper.tearDown();
        System.out.println("It runs after each scenario");
    }
}
