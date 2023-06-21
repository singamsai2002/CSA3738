package Proj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginpage {
public static void main(String s[]) {

 WebDriver driver = new ChromeDriver();
 System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
 driver.get("https://www.swiggy.com/?utm_source=GoogleSok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v
1_v2_march23_brand_em&gclid=CjwKCAjwjYKjBhB5EiwAiFdSfrdLVAUKWyVK60DxCwxHLKmh3lOfjK9ya_mDXHMfbN5Waws1oQUvhoCNFsQAvD_BwE");

 WebElement textBox = driver.findElement(By.className("x4bK8"));
 driver.manage().window().maximize();
textBox.click();

}
}
