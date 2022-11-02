package com.symund.step_definitions;

import com.symund.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before Scenario is running");


    }

    @After
    public void tearDown(){
        System.out.println("After Scenario is running");
        Driver.closeDriver();

    }

}
