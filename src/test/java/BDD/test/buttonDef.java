package BDD.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.driverfactory;
import io.cucumber.java.en.*;

public class buttonDef extends driverfactory{
	@When("click the button field")
	public void clickTheButtonField() throws Exception {
	  driver.findElement(By.xpath(driverfactory.getxpath("button"))).click();
	    }
	
	@When("verify that user landed in button pages")
	public void verifyThatUserLandedInButtonPages() {
	   String title=driver.getTitle();
	    Assert.assertEquals(title, "Interact with Button fields");
	}
	
	@When("verify the button types and thier properties")
	public void verifyTheButtonTypesAndThierProperties() throws Exception {
	   WebElement position=driver.findElement(By.xpath(driverfactory.getxpath("position")));
	   int x=position.getLocation().getX();
	   int y=position.getLocation().getY();
	   System.out.println("x is "+x+" y is "+y);
	   WebElement color=driver.findElement(By.xpath(driverfactory.getxpath("color")));
	   String bg=color.getCssValue("background-color");
	   System.out.println(bg);
	   WebElement property=driver.findElement(By.xpath(driverfactory.getxpath("property")));
	   int height=property.getSize().getHeight();
	   int width=property.getSize().getWidth();
	   System.out.println("height is "+height+" width is "+width);
	   WebElement disable=driver.findElement(By.xpath(driverfactory.getxpath("buttondisable")));
	   System.out.println(disable.isEnabled());	
	}

}
