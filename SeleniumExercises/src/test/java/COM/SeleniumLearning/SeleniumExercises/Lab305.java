package COM.SeleniumLearning.SeleniumExercises;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {
	
	@Test
	public void testVWOLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.VWO.com");
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(),"Login - VWO");
		Assert.assertEquals(driver.getCurrentUrl(),"https://app.VWO.com");
		driver.quit();
		
	}

}
