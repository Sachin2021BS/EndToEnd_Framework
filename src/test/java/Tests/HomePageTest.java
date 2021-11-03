package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Academy.Base;
import Pages.HomePage;

public class HomePageTest extends Base{

	@Test
	public void Launch() throws IOException
	{
		driver=initialDriver();
		driver.get("https://qaclickAcademy.com");
		HomePage hp=new HomePage(driver);
		hp.getlogin().click();
		//driver.quit();
	}

}
