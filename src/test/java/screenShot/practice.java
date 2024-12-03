package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "I:\\Seleniumdriver\\chromedriver-win64\\chromedriver-win64");

		driver.get("http:www.google.com");

		practice p = new practice();
		p.screenUtility(driver, "Homepage");
		
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
		print();

	}

	public static void screenUtility(WebDriver driver, String ScreenshotName) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/" + ScreenshotName + ".png");
		FileUtils.copyFile(srcFile, destination);

	}
	
	public static void print()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
	}

	public static void print1()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
	}
	
	public static void print2()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
	}
	
	public static void print3()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
	}
	

}
