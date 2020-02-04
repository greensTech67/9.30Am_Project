package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class La {

	public static void main(String[] args) {

		// SetProperty
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium9.30\\drivers\\chromedriver.exe");

		// WeBdriver

		WebDriver driver = new ChromeDriver();

		// Launch
		driver.get("https://www.facebook.com/");

		// To Get the Current Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// To Get the Title
		String title = driver.getTitle();
		System.out.println(title);

		// To find the locator

		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		// To insert the values
		mail.sendKeys("saranya12");

		// To fill the password

		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pwd.sendKeys("56789");

		// Button

		WebElement btn = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		btn.click();

		System.out.println("Raseem");
		System.out.println("Raseem");
		System.out.println("Raseem");
		System.out.println("Raseem");
		System.out.println("Raseem");
		System.out.println("Raseem");

	}

}
