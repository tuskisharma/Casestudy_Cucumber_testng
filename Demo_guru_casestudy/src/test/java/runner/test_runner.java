package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/gurulogin/guru.feature"}, glue={"definition"},tags="@PositiveTesting",plugin= {"html:tushar/sharma.html"})
public class test_runner extends AbstractTestNGCucumberTests{

}
