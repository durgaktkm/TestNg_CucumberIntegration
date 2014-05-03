package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format = "json:target/cucumber-report.json", features={"target/test-classes/features/"})
public class RunCukesTest extends AbstractTestNGCucumberTests {

}