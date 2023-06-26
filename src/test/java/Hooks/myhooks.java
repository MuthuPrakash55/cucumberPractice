package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myhooks {
	WebDriver driver;
	
	@Before
	public void getapp() {
		driverfactory.intializebrowser("chrome");
		driver=driverfactory.getdriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
	}
	
	@After
	public void screenshot(Scenario scenario) {
		byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", scenario.getName());
	}
}
