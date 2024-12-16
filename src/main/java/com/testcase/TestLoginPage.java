package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage {
	
	
	@Test
	public void AdminHeader() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		String Actresult = driver.findElement(By.xpath("/html/body/header")).getText();
		String Expresult = "kiran Academy";
		driver.close();
		Assert.assertEquals(Actresult, Expresult);

	}

	
	@Test
	public void Title() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.getTitle();
		String expresult = "login tka";
		driver.close();
		Assert.assertEquals(actresult, expresult);
	}

	@Test
	public void testMainHeading() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		// testing
		String Expresult = "Welcome Back";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void testSubHeading() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/selenium/login.html");
		// testing
		String actresult = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		String Expresult = "Login to manage your tests and categories";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void UsernameText() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText();
		String Expresult = "Username";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void PasswordText() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label")).getText();
		String Expresult = "Password";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void LoginButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
		String Expresult = "Login";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void ValidData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String ExpResult = "Admin Panel";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);

	}

	@Test
	public void InvalidUsername() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);

	}

	@Test
	public void InvalidPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
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
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);

	}

	@Test
	public void TestSymbolicUsername() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("******");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test
	public void TestSymbolicPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("*****");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("&&&&&");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		driver.close();
		Assert.assertEquals(actResult, ExpResult);
	}

	@Test
	public void Categories() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories\"]/div[1]/h2")).getText();
		String Expresult = "Categories";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void SubCategories() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"/html/body/header/nav/a[2]")).getText();
		String Expresult = "SubCategories";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void logoutButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String actresult = driver.findElement(By.xpath("/html/body/header/nav/a[3]")).getText();
		String Expresult = "logout";
		driver.close();
		Assert.assertEquals(actresult, Expresult);

	}

	@Test
	public void TestAddCategoriesText() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actresult = driver.findElement(By.xpath("//*[@id=\"add-category\"]")).getText();
		String Expresult = "Add Category";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void TestAddCategories() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\\\"category-name\\\"]")).getText();
		String Expresult = "English";
		driver.close();
		Assert.assertEquals(actresult, Expresult);

	}

	@Test
	public void TestEditButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[1]"))
				.getText();
		String Expresult = "Edit";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void TestDeleteButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]"))
				.getText();
		String Expresult = "Delete";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}
	@Test
	public void TestSaveButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).getText();
		String Expresult = "Save";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void TestCancelButton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"close-modal\"]")).getText();
		String Expresult = "Cancel";
		driver.close();
		Assert.assertEquals(actresult, Expresult);
	}

}
