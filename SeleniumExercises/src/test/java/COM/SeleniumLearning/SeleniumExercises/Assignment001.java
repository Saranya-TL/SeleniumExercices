package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment001 {
	WebDriver driver = new EdgeDriver();
	
	@Test(priority = 1)
	public void testVWOLoginPositive() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com");
		
		WebElement userName = driver.findElement(By.xpath("//div//input[@id='login-username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
		WebElement submitButton = driver.findElement(By.xpath("(//div[@class='login-wrap']//button/span[text()='Sign in'])[1]"));
			
		userName.sendKeys("saranyadevi.be@gmail.com");
		password.sendKeys("Admin@123");
		submitButton.click();
		Thread.sleep(5000);
		//Assertion;
		WebElement LogoDisplay = driver.findElement(By.xpath("//div[@data-qa='vwo-app-logo-main']/a/img"));
		Assert.assertTrue(LogoDisplay.isDisplayed());
		System.out.println("Successfully logged in");
		

	}
	
	@Test(priority = 2)
public void testDashboardNameDisplay() {
		
		String dashboardName = driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		
		//Assertion;
		Assert.assertEquals(dashboardName, "Dashboard");
		System.out.println("Dashboard Name is displayed correctly");
		
		driver.quit();
		
	
	

	}

}
