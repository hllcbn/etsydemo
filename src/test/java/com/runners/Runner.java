package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/etsy/features",
        glue = "com/stepdefinitions",
        dryRun = false,
        tags = "@ahmet and @mehmet",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}



)
public class Runner {
}
