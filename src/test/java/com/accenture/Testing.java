package com.accenture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
