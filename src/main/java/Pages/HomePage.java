package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    
	public WebDriver driver;
	By sigin= By.cssSelector("a[href*='sign_in']");
	////span[@text="Login"]
	

	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getlogin()
	{
		return driver.findElement(sigin);
	}
}
