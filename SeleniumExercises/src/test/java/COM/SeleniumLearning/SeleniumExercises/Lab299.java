package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Lab299 {
	
	public static void main (String[]args) {
		
        //Import Concept of OOPs ->
        // interface interfaceRef = new Class();
        //  1. Inheritance
        //  2. - Upcasting -> Dynamic Dispatch
		
		WebDriver edgeDriver = new EdgeDriver();
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver firefoxDriver = new FirefoxDriver();
		WebDriver ieDriver = new InternetExplorerDriver();
		WebDriver safariDriver = new SafariDriver();
	}
	
    //     // Opera - Selenium 4- Removed!

    // SearchContext(I) (2)
    // -> WebDriver(I)( 10)
    // -> RemoteWebDriver(C) (15)
    // -> ChromiumDriver(C) 25
    // -> EdgeDriver(C) (45)

     // Chrome
    // SearchContext(I)
    // -> WebDriver(I)
    // -> RemoteWebDriver(C)
    // -> ChromiumDriver(C)
    // -> ChromeDriver(C)

}
