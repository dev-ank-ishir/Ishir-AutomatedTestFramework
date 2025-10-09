package com.ishir.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/features"},
         tags ="@StaffingPage",
        glue= {"com.ishir.hooksmanager", "com.ishir.stepsdefinitions"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/Rerun.txt"},
        publish = true,
        dryRun = false
)
public class TestAppRunner {

}
