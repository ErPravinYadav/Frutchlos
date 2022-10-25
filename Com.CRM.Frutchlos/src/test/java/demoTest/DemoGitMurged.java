package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGitMurged {

	
	@Test
	public void demogit()
	{
		WebDriver driver= new ChromeDriver();  //launch the empty browser
		System.out.println("Changes made in repository");
		System.out.println("This is demo");
		System.out.println("Changes made in working directory");
	}
	
	@Test
	public void demogit0()
	{
		WebDriver driver= new ChromeDriver();  //launch the empty browser
		System.out.println("Changes made in repository");
		System.out.println("This is demo");
		System.out.println("Changes made in working directory");
	}
}
