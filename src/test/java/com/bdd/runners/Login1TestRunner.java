package com.bdd.runners;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/login1.feature" }, glue = {
		"classpath:com.bdd.stepDefinitions" }, plugin = { "pretty:build/reports/cucumber-pretty.txt",
				"html:build/reports/cucumber", "junit:build/reports/junit.xml",
				"json:build/reports/cucumber1.json" }, tags = { "@login" })
public class Login1TestRunner extends AbstractTestNGCucumberTests {
	@BeforeClass
	public void setUp() {
		// This will write the log in HTML and on console as well
		System.out
				.println("Login1TestRunner is executed via Thread and Thread Id is " + Thread.currentThread().getId());
	}
}
