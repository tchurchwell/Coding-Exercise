package com.cengage.qa.assignment.smoketests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cengage.qa.assignment.pages.HomePage;

public class HomePageTest {
	
	protected HomePage homePage;
	protected static String HOME_PAGE_TITLE = "Cengage Learning - Learning solutions, training and educational publishing";
    
	@Before
	public void setUp() {
		homePage = new HomePage();
	}
	
    @After
	public void tearDown() {
    	homePage.closeSession();
	}
    
	@Test
    public void verifyHomePageContainsCorrectDisplayElements() {
    	assertThat(homePage.getTitle(), is(HOME_PAGE_TITLE));
    }
	

	

    
}
