package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){

    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
