package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment002 {
	
	@Test
	public void testHerokuapp() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://katalon-demo-cura.herokuapp.com");
		WebElement makeAppoinment = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
		makeAppoinment.click();
		
		
		String newURL = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
		Assert.assertEquals(driver.getCurrentUrl(), newURL);
		
		WebElement userName = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='txt-username']"));
		WebElement password = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='txt-password']"));
		WebElement submit = driver.findElement(By.xpath("//button[text()='Login']"));
		
		userName.sendKeys("John Doe");
		password.sendKeys("ThisIsNotAPassword");
		submit.click();
		
		String currentURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
		Assert.assertEquals(driver.getCurrentUrl(), currentURL);
		System.out.println("URL is changed correctly");
		WebElement pageSubtitle = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
		Assert.assertTrue(pageSubtitle.isDisplayed());
		System.out.println("Make appoinment title is displayed");
		driver.quit();
		
	}

}
