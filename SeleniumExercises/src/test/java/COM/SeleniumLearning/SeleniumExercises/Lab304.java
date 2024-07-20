package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab304 {

	public static void main (String[] args) throws MalformedURLException {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.bing.com");
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().to(new URL("https://app.vwo.com"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}
}
