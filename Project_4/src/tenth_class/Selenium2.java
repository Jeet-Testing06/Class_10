// facebook signup automation


package tenth_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("abc");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("def");
		
		WebElement emailaddress = driver.findElement(By.name("reg_email__"));
		emailaddress.sendKeys("abcdef@gmail.com");
		
		WebElement reenteremailaddress = driver.findElement(By.name("reg_email_confirmation__"));
		reenteremailaddress.sendKeys("abcdef@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("abcdef");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");
		
		WebElement gender = driver.findElement(By.id("u_0_a"));
		gender.click();
		
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
		//driver.close();
		
		}
}