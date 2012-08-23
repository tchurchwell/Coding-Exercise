package com.cengage.qa.assignment.pages;

import static com.cengage.qa.assignment.Environment.DEFAULT_WAIT_TIME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BasePage {

	public static final long ONE_SECOND = 1000;
    
    protected WebDriver driver;
    protected WebElement element;

	protected BasePage(WebDriver driver) {
		this.driver = driver;
        waitForPageToLoad();
	}

	protected BasePage(String url) {
	    createWebDriver();
		driver.get("http://"+url);
        waitForPageToLoad();
	}

    private void createWebDriver() {
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

	public WebDriverBackedSelenium getSeleniumHandle() {
        return new WebDriverBackedSelenium(driver, driver.getCurrentUrl());
	}
	
	public String getTitle(){
    	return driver.getTitle();
    }
	
	public void goBack() {
		getSeleniumHandle().goBack();
	}

	public void closeSession() {
		driver.quit();
	}
    
	public void waitForPageToLoad() {
		getSeleniumHandle().waitForPageToLoad(Long.toString(DEFAULT_WAIT_TIME));
    }

	
}