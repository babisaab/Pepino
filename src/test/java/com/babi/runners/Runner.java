package com.babi.runners;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		        features = "src/test/resources/features/",
		        glue = "com.babi.steps",
		        tags = {"@unitarios"},
		        //tags = {"@tipo1, @tipo2"}, //executa apenas o cenário que conter a tag "@esse"
		        plugin = {"pretty", "html: target/report-html", "json:target:report.json"}, 
                monochrome = true, //tira caracteres especiais (sem cor)
                snippets = SnippetType.CAMELCASE, //nome dos métodos como em JAVA
                dryRun = false, //não executa, somente valida os passos
                strict = false)
public class Runner {

	
}
