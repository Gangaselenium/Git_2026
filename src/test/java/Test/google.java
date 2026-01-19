package Test;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	
	@Test
	public void searchPage() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//div[text()=\"Alles accepteren\"]")).click();
		
		////div[@id='SIvCob']//a[text()='English']
		driver.findElement(By.xpath("//div[@id='SIvCob']//a[text()='English']")).click();
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		
		
		List<WebElement>ls=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul[@jsname='bw4e9b'] //li"));
		
		System.out.println(ls.size());
		
		for(WebElement e:ls) {
			
			System.out.println(e.getText());
			if(e.getText().equals("selenium testing")) {
				
				e.click();
				break;
			}
		
		}
		
		driver.close();
		
	}

	
	
	
}
