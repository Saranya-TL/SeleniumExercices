package COM.SeleniumLearning.SeleniumExercises;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;

public class Lab308 {
	public static void main(String[] args) {
	
	EdgeOptions options = new EdgeOptions();
	
	options.addArguments("--start maximized");
	options.addArguments("--guest");
	options.addArguments("--window-size=800,600");
	
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("222.129.35.173:57114");
	options.setCapability("proxy",proxy);
	
	WebDriver driver = new EdgeDriver(options);
	driver.get("https://whatismyipaddress.com");
	driver.manage().window().maximize();
	
	
	
	
	}

}
