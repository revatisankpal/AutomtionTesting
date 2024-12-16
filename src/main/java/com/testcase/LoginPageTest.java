package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
	@Test
	public void Title() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.getTitle();
		String expresult = "login tka";
		//driver.close();
		Assert.assertEquals(actresult, expresult);
	}

	@Test//(enabled = false)
	public void welcomeHeading() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		String ExpResult = "Welcome To TKA";
		//driver.close();
		Assert.assertEquals(actResult, ExpResult);
		driver.manage().deleteAllCookies();
	}

	@Test//(enabled = false)
	public void subHeading() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		String ExpResult = "Login to manage your tests and categories";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test//(enabled = false)
	public void loginButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
		String ExpResult = "Login";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test//(enabled = false)
	public void Username() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText();
		String ExpResult = "Username";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test//(enabled = false)
	public void Password() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label")).getText();
		String ExpResult = "Password";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test//(enabled = false)
	public void logo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult = driver.findElement(By.xpath("/html/body/div/div/div/img")).getText();
		String ExpResult = "THE KIRAN ACADEMY ";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test
	public void validData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		//testing
		String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String ExpResult = "Admin Panel";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);


	}
	@Test
	public void invalidusername() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ADMIN");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Invalid username or password";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void Invalidusername() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("oooo");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult = "Invalid username or password";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void BothAreBlank() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Please fill our this field";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void usernameBlanck() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Please fill our this field";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void PasswordBlank() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Please fill our this field";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void usernameSymbol() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("****");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Invalid username or password";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void PasswordSymbol() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("*****");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult = "Invalid username or password";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}
	@Test
	public void BothSymbol() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("&&&&&");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("*****");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	//testing
	String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpResult ="Invalid username or password";
	driver.close();
	Assert.assertEquals(actResult, ExpResult);
	}






}