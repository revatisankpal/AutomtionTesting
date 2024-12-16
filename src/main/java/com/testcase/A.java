package com.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	@Test
	public void testcaseone() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();//delete
	}

}
