package com.ishir.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        //"@HomePage or @AboutPage or @TeamsPage or @EventsPage or @NewsPage or @ClientsPage or @SuccessStories or @InsightPage"
        features = {"src/test/resources/features"},
        tags = "@Accelerator",
        glue= {"com.ishir.hooksmanager", "com.ishir.stepsdefinitions"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/Rerun.txt"},
        publish = true,
        dryRun = false
)
public class TestAppRunner {

}
