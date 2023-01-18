package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> el = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		
		for(WebElement aa : el) {
			System.out.println(aa.getAttribute("href"));
		}
		
		if(el.size()==4) {
			System.out.println("pass");
		}
	
	}

}
