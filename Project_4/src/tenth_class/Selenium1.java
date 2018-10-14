// facebook login automation


package tenth_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		// Classname and tag with classname (css) are duplicate
		//Tag with inner text to be confirm by sir
		
		//WebElement emailorphone = driver.findElement(By.id("email"));
		//emailorphone.sendKeys("abc@xyz.com");
		
		//WebElement emailorphone = driver.findElement(By.name("email"));
		//emailorphone.sendKeys("abc@xyz.com");
		
		//WebElement emailorphone = driver.findElement(By.cssSelector("input#email"));
		//emailorphone.sendKeys("abc@xyz.com");
		
		//WebElement emailorphone = driver.findElement(By.cssSelector("input[id='email']"));
		//emailorphone.sendKeys("abc@xyz.com");
		
		WebElement emailorphone = driver.findElement(By.cssSelector("input.inputtext[id='email']"));
		emailorphone.sendKeys("email");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("password");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
		driver.close();
		
	}

}