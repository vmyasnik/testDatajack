package ru.testdata;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ru.testdata"},
        features = {"src/test/resources/features"},
        tags = {"@PPp"})
public class CucumberTest {

}
