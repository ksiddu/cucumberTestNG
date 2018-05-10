package com.bdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources" }, 
        glue = { "classpath:com.bdd.stepDefinitions" }, plugin = {
	    "pretty:build/reports/cucumber-pretty.txt",
        "html:build/reports/cucumber",
		"junit:build/reports/junit.xml",
		"json:build/reports/cucumber.json"}, 
       tags = { "@login" })
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
