package br.tassio.ca;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"json:target/surefire-reports/cucumber.json" }, features = {
				".\\src\\main\\resources\\features\\" }, glue = { "steps" }, tags = "@ID01")

public class Test {

}
