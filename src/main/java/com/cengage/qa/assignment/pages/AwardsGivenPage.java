package com.cengage.qa.assignment.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwardsGivenPage extends BasePage{

	protected AwardsGivenPage(WebDriver driver) {
		super(driver);
	}
	
    public String countMainTableColumnHeaders() {
    	String count;
    	
    	WebElement tableArticles = driver.findElement(By.id("articles")); 
    	count = tableArticles.getSize().toString();
    	
    	return count;
    }

	

}
