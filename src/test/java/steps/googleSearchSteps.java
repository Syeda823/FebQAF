package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchSteps {
	
	WebDriver driver;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		WebElement searchBx;
		searchBx = driver.findElement(By.name("q"));
		
		searchBx.sendKeys(string);
		
	    
	    
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
	    
	    WebElement searchBtn;
	    searchBtn = driver.findElement(By.name("btnk"));
	    
	    searchBtn.click();
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	    
	    WebElement resultStats;
	    resultStats = driver.findElement(By.name("result-stats"));
	    
	    String result = resultStats.getText();
	    
	    System.out.println("===========================================");
	    System.out.println(resultStats.getText());
	    System.out.println("============================================");
	}


}
