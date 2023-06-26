package BDD.test;

import org.openqa.selenium.By;
import org.testng.Assert;

import factory.driverfactory;
import io.cucumber.java.en.*;

public class inputDef extends driverfactory{
	@Given("verify that user navigate to right application")
	public void verifyThatUserNavigateToRightApplication() {
		  driver= driverfactory.getdriver();
		  String title=driver.getTitle();
		  Assert.assertEquals(title, "LetCode with Koushik");
	    
	}
	@When("User click the workspace butoon")
	public void userClickTheWorkspaceButoon() throws Exception {
	   driver.findElement(By.xpath(driverfactory.getxpath("workspace"))).click();
	    
	}
	@Then("verify that user landed in right application page")
	public void verifyThatUserLandedInRightApplicationPage() {
	  String title=driver.getTitle();
	    Assert.assertEquals(title, "Interact with Input fields");
	}
	@When("user click the edit button")
	public void userClickTheEditButton() throws Exception {
	  driver.findElement(By.xpath(driverfactory.getxpath("edit"))).click();
	}
	@Then("verify that user can able to fill and check the fields")
	public void verifyThatUserCanAbleToFillAndCheckTheFields() throws Exception {
	   driver.findElement(By.xpath(driverfactory.getxpath("fullname"))).sendKeys(driverfactory.getdata("fullname"));
	   driver.findElement(By.xpath(driverfactory.getxpath("append"))).sendKeys(driverfactory.getdata("append"));
	   String text=driver.findElement(By.xpath(driverfactory.getxpath("insidebox"))).getAttribute("value");
	   System.out.println(text);
	   driver.findElement(By.xpath(driverfactory.getxpath("clear"))).clear();
	   boolean enable=driver.findElement(By.xpath(driverfactory.getxpath("disabled"))).isEnabled();
	   System.out.println(enable);
	   String readonly=driver.findElement(By.xpath(driverfactory.getxpath("readonly"))).getAttribute("readonly");
	   System.out.println(readonly);
	
	
	
	}

}
