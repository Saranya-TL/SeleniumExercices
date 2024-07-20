package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab302 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sdet.live");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println((driver.getPageSource()));
		driver.quit();
	}

}
