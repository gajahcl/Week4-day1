package week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ewebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new  ChromeOptions();
		options.addArguments("--disable-notifications");
        ChromeDriver driver =new ChromeDriver();
		
        driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dropdown = driver.findElement(By.id("s-result-sort-select"));
		Select text=new Select(dropdown);
		text.selectByIndex(1);
		driver.findElement(By.linkText("Price: Low to High")).click();
		Thread.sleep(3000);
		List<WebElement> opt = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size=opt.size();
		List<Integer> price=new ArrayList<Integer>();
		Thread.sleep(3000);
		for(int i=0;i<=size-1;i++) {
			String rupees=opt.get(i).getText();
			String replaceAll = rupees.replaceAll(",","");
			
			//parseint user for convert string into integer or int to float 
			int int1 = Integer.parseInt(replaceAll);

			  price.add(int1);
			  
			  Collections.sort(price);
					
				

		
		}
		System.out.println(price);

System.out.println("Lowest Price is:" +price.get(0));
driver.close();
	}
	

}
