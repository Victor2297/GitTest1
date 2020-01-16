package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTest1 {
	WebDriver driver;
	String driverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	String baseUrl = "https://www.guru99.com/";
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void meth1() {
		driver.get(baseUrl);
		String title1 = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		String title = driver.getTitle();
		if(title1.contentEquals(title)) {
			System.out.println("Test trecut cu succes");
		}else {
			System.out.println("Test test trecut fara succes");
		}
		driver.quit();
		}
	}
