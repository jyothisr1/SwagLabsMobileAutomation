package com.automation.Steps;

import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }
    @After
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
