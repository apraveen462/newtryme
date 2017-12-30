package mytestmaven.gitjenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkingit {

	@Test
	
	public void test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.linkText("Gmail")).click();
		String s=driver.getCurrentUrl();
		
		if (s.contains("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true"))
		{
			System.out.println("Testcase Pass");
		}
		else
		{
			System.out.println("Testcase Fail");
		}
driver.close();
	}
}
