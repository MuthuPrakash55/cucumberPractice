package BDD.test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="./src/test/resources/features/table.feature",
					glue = {"BDD.test","Hooks"},
					//dryRun = true,
					snippets = SnippetType.CAMELCASE,
					plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty.html",
								"json:target/cucumber-reports/CucumberTestReport.json",
								"rerun:target/cucumber-reports/rerun.txt",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests{

}
