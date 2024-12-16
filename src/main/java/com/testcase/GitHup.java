package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GitHup {
	WebDriver driver = null;

	@BeforeClass
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}
	@Test
	public void Title() {
		String actresult=driver.getTitle();
		String expresult="Sign in to GitHub · GitHub";
		Assert.assertEquals(actresult, expresult);
	}

	@Test
	public void MainHeading() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/h1")).getText();
		String Expresult = "GitHup";
		Assert.assertEquals(actresult, Expresult);
	}
	@Test
	public void validData() {
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("revatisankpal");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();
		
	}

}
