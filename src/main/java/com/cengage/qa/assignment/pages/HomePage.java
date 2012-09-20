package com.cengage.qa.assignment.pages;

import static com.cengage.qa.assignment.Environment.PRODUCT_URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage() {
		super(PRODUCT_URL);
	}

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage(String url) {
		super(url);
	}

	public AwardsRewardedPage gotoAwardsReceivedPage() {
		driver.findElement(By.linkText("News")).click();
		driver.findElement(By.partialLinkText("Awards Received")).click();
		return new AwardsRewardedPage(driver);
	}

	public AwardsGivenPage gotoAwardsGivenPage() {
		driver.findElement(By.linkText("Awards Given")).click();
		return new AwardsGivenPage(driver);
	}

}
