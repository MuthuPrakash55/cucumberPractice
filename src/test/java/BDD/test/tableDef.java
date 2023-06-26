package BDD.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.driverfactory;
import io.cucumber.java.en.*;

public class tableDef extends driverfactory {
	
	@Then("user click the advance table button")
	public void userClickTheAdvanceTableButton() throws Exception {
	    driver.findElement(By.xpath(driverfactory.getxpath("table"))).click();
	    
	}
	@Then("verify that user landed in right table page")
	public void verifyThatUserLandedInRightTablePage() {
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "LetCode - Testing Hub");
	}
	@Then("verify that user can able collect data from table")
	public void verifyThatUserCanAbleCollectDataFromTable() throws Exception {
	//	JavascriptExecutor exe=(JavascriptExecutor)driver;
	//	exe.executeScript("window.scroll(0,750)", " ");//---> page to scroll down of y axis in 750
		List<WebElement> table=driver.findElements(By.xpath(driverfactory.getxpath("tabledata")));
	   // List<String>name=new ArrayList<>();//-----> it will store array list like [1,university of aberden,uk]
	    for(WebElement name1:table) {
	    	 System.out.println(name1.getText());
	    }
	  
	}
	

}
