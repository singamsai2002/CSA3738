package msd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class dube{

public static void main(String[] args) {
	
	
	System.out.println("hai");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishnu\\Desktop\\software testing\\csa3738\\csa37 class jar file\\Sellinium and junit\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
					
	driver.get("https://www.flipkart.com/account/login");
	WebElement username=driver.findElement(By.id("102988293558"));
	
	System.out.println(username);

	WebElement password=driver.findElement(By.id("742044692"));
	System.out.println(password);
	WebElement login=driver.findElement(By.name("9czts"));
	
	System.out.println(login);
	username.sendKeys("6302080554");
	
	
	password.sendKeys("sai@7287");
	login.click();

}
}

