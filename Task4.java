package assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		List<String> names = Arrays.asList("Twitter ", "FaceBook ","Linkedin ","Youtube ");
		List<WebElement> el = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		HashMap<String, String> hm = new  HashMap<String,String>();
		
		for(int i=0;i<names.size();i++) {
			hm.put(names.get(i), el.get(i).getAttribute("href"));	
		}	
		
		for (Entry<String, String> entry : hm.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
