package com.babi.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		        features = "src/test/resources/features/",
		        glue = "com.babi.steps",
		        tags = {"@funcionais"},
		        //tags = {"@tipo1, @tipo2"}, //executa apenas o cenário que conter a tag "@esse"
		        plugin = {"pretty", "html: target/report-html", "json:target:report.json"}, 
                monochrome = true, //tira caracteres especiais (sem cor)
                snippets = SnippetType.CAMELCASE, //nome dos métodos como em JAVA
                dryRun = false, //não executa, somente valida os passos
                strict = false)

public class RunnerFuncional {

	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver","\\Users\\bssaab\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://srbarriga.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("ssantanasaab@yahoo.com.br");
		driver.findElement(By.name("senha")).sendKeys("babi123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
	
	
}