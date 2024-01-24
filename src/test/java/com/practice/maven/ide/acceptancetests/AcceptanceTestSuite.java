package com.practice.maven.Maven_Prac_Via_IDE.acceptancetests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="com.practice.maven.Maven_Prac_Via_IDE")
public class AcceptanceTestSuite {}
