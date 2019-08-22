package Seleniun.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytest {

	/**
	 * @author ajith.periyasamy
	 *
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.lambdatest.com/");
		web.findElementByClassName("login").click();
		WebElement orgname = web.findElement(By.name("organization_name"));
		orgname.sendKeys("atmecs");
		WebElement name = web.findElement(By.name("name"));
		name.sendKeys("moorthy");
		WebElement email = web.findElement(By.name("email"));
		email.sendKeys("xowrz@maillist.in");
		WebElement pass = web.findElement(By.name("password"));
		pass.sendKeys("1366133");
		WebElement ph = web.findElement(By.name("phone"));
		ph.sendKeys("8976546789");
		WebElement agree = web.findElement(By.id("terms_of_service"));
		agree.click();
		WebElement submit = web.findElement(By.cssSelector("button[type=\"submit\"]"));
		submit.click();
		/*
		 * WebElement linkByText = web.findElement(By.linkText("Login"));
		 * linkByText.click(); WebElement Userna = web.findElement(By.name("email"));
		 * Userna.sendKeys("xowrz@maillist.in");
		 * 
		 * WebElement Pass = web.findElement(By.name("password"));
		 * Pass.sendKeys("1366133"); WebElement btn=
		 * web.findElement(By.tagName("button")); btn.click(); WebElement emaillink=
		 * web.findElement(By.partialLinkText("Lambda Test"));
		 * 
		 * emaillink.click();
		 */
		web.close();

	}

}
