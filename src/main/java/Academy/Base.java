package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver;
	public WebDriver initialDriver() throws IOException {

		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\EndToEndFramework\\E2EProject\\src\\main\\resources\\Resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("Webdriver.gecko.driver","C:/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("Webdriver.Edge.driver","C://edgedriver_win64/edgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("There is no such browser to launch");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
