//Day11   6/8/2016
//This maven project is associated with git

package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Maven-Jenkins-git-test1");
		driver.close();
		
	}
}

