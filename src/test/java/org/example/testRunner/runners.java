package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"org.example.stepDevs"},
        plugin = {"pretty\", \"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cakes.xml",
                "rerun:target/rerun.txt"},
        tags = "@Test"
)

public class runners extends AbstractTestNGCucumberTests {
}
