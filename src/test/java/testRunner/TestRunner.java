package testRunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/featureFiles" ,
		glue="stepDefinationFiles"
       )
public class TestRunner {

}

//h w
/*
 * background in cucumber
hooks in cucumber


dry run-True=Check if all the steps have step defination. Default fale
features-Set the path of feature file
glue -set the path of step defination file
tags-instruct what tag should be execcuted
monchrome -true- display the console output default false
formart-set all formator to use
Strict: true: will fail execution if there ae undefined steps

 */
