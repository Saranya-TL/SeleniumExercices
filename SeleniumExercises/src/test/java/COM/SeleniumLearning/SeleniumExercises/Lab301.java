package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lab301 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/c/users/chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
        // JSON wire protocol
   //     driver.get("https://sdet.live");
 

      // Selenium 4.0
      // Selenium manager - W3C protocol
      // opera Removed - :)
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://sdet.live");
	}

}
