package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {

	public static void main(String[] args) throws AWTException {

		// Config the driver

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium9.30\\drivers\\chromedriver.exe");

		// Launch the browser

		WebDriver driver = new ChromeDriver();

		// To get the url

		driver.get(
				"https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_EAIaIQobChMIkueQ1v2Y5wIVi8qyCh2ySAGgEAAYASAAEgI7DvD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIkueQ1v2Y5wIVi8qyCh2ySAGgEAAYASAAEgI7DvD_BwE");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 5s");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement phone = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']"));
		WebElement phone = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']"));
		WebElement phone = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']"));
		WebElement phone = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']"));

		phone.click();
		// To Get Current Window Id
		String pwId = driver.getWindowHandle();

		System.out.println(pwId);

		// To Get All Window Id
		Set<String> AllId = driver.getWindowHandles();

		System.out.println(AllId);
		
		//For Multiple Windows
		List<String> li = new ArrayList<String>();
		
		li.addAll(AllId);
		
		
		driver.switchTo().window(li.get(1));
		

		
		//To Perform in second Window
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("Conflict");
		System.out.println("Conflict");
		System.out.println("Conflict");
		System.out.println("Conflict");
		System.out.println("Conflict");

	}

}
