package com.ishir.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/features"},
        tags = "@AboutPage or @TeamsPage or @NewsPage or @ClientsPage or @SuccessStories or @InsightPage or @StaffingPage",
        glue= {"com.ishir.hooksmanager", "com.ishir.stepsdefinitions"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/Rerun.txt"},
        publish = true,
        dryRun = false
)
public class TestAppRunner {

}
