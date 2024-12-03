package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		File screeshot = email.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screeshot, new File("./screenshot/element.png"));
		printer();

	}
	
	public static void printer()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Workspace");
		System.out.println("This is changed Eclipse");
	}
	
	public static void printers()
	{
		System.out.println("This is changed Benjamnin");
		System.out.println("This is changed Edward");
		System.out.println("This is changed Eclipse");
	}
	
	public static void printeer()
	{
		System.out.println("This is changed code");
		System.out.println("This is changed Place");
		System.out.println("This is changed Eclipse");
	}
	
	public static void mountains()
	{
		System.out.println("This is changed Everest");
		System.out.println("This is changed Plague");
		System.out.println("This is changed Volcano");
	}

}
