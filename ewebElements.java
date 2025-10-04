package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;

public class ewebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new  ChromeOptions();
		options.addArguments("--disable-notifications");
        ChromeDriver driver =new ChromeDriver();
		
        driver.get("https://www.amazon.in/");
		driver.manage().timeouts();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dropdown = driver.findElement(By.id("s-result-sort-select"));
		Select text=new Select(dropdown);
		text.selectByIndex(1);
		driver.findElement(By.linkText("Price: Low to High")).click();
		driver.manage().timeouts();
		Thread.sleep(3000);
		List<WebElement> opt = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size=opt.size();
		List<String> price=new ArrayList<String>();
		for(int i=0;i<=size-1;i++) {
			String rupees=opt.get(i).getText();
			  price.add(rupees);
			  
			  Collections.sort(price);
				
				
				System.out.println("Lowest Price is:" +price.get(0));
				
				
				driver.close();
				

		
		}
		
		

	}

}
