import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumExample {
 public static void main(String[] args) {
 // Set the path to the chromedriver executable
 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
 // Create a new instance of the Chrome driver
 WebDriver driver = new ChromeDriver();
 // Navigate to GitHub
 driver.get("https://github.com");
 // Close the browser
 driver.quit();
 }
}
