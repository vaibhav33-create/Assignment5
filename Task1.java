package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String ss = driver.getCurrentUrl();
		
		boolean lo = ss.endsWith("login");
		System.out.println(lo);
		
		
		boolean a = ss.contains("demo");
		System.out.println(a);
		
		
		String title = driver.getTitle();
		
		boolean tl =title.contains("HRM");
		System.out.println(tl);
		
		Thread.sleep(2000);
		boolean logo = driver.findElement(By.xpath("(//img[contains(@src,'/web/images')])[1]")).isDisplayed();
		
		System.out.println(logo);
		
		
		
		List<WebElement> el = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		
		for(int i=0;i<el.size();i++) {
			System.out.println(el.get(i).getAttribute("href"));
			
			String dd = el.get(i).getAttribute("href");
			if(dd.contains("youtube")) {
				System.out.println("found youtube");
				break;
			}
		}
	
		
		
		
		
	
	
	}

}
