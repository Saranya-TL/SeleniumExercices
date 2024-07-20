package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;

public class Lab309 {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://app.vwo.com/#/login");
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
