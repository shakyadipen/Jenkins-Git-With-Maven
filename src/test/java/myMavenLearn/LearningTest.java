package myMavenLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LearningTest {
	@Test
	public void test() {
		
		System.out.println("Run");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com.np/?gws_rd=cr&ei=roKsUtBwi5CuB5j7gMAM");
		driver.manage().window().maximize();
	}

}
