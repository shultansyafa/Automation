package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import runner.BaseTest;

public class webHooks extends BaseTest {

    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
