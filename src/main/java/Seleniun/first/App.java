package Seleniun.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.gmail.com/");
		web.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ajith.periyasamy@atmecs.com");
		web.findElement(By.xpath("//span[@class='CwaK9']")).click();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.findElement(By.xpath("//input[@name='password']")).sendKeys("Ambtech003@230117");
		web.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		web.findElement(By.xpath("//div[@class='aio UKr6le']")).click();
		web.findElement(By.xpath("//a[contains(text(),'Starred')]")).click();
		Thread.sleep(3000);

		web.close();

	}
}
