package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase {
	WebDriver driver = null;

	@BeforeClass
	public void setupBrower() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/selenium/admin.html");

	}
	@AfterClass
	public void BrowerClosed() {
		driver.close();
	}

	@Test
	public void AdminHeader() {
		String Actresult = driver.findElement(By.xpath("/html/body/header")).getText();
		String Expresult = "kiran Academy";
		Assert.assertEquals(Actresult, Expresult);
      //output:expected [kiran Academy] but found [Admin Panel Categories Subcategories Logout] 
	}

	@Test
	public void Title() {

		String actresult = driver.getTitle();
		String expresult = "Admin Panel - Manage Categories";
		Assert.assertEquals(actresult, expresult);
		//output:expected [login tka] but found [Admin Panel - Manage Categories]
	}

	@Test
	public void testMainHeading() {


		String actresult = driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		// testing
		String Expresult = "Welcome Back";
		Assert.assertEquals(actresult, Expresult);
	//output:passed
	}

	@Test
	public void testSubHeading() {

		// testing
		String actresult = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		String Expresult = "Login to manage your tests and categories";
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void UsernameText() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText();
		String Expresult = "Username";
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void PasswordText() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label")).getText();
		String Expresult = "Password";
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void LoginButton() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
		String Expresult = "Login";
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void ValidData() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String ExpResult = "Admin Panel";
		Assert.assertEquals(actResult, ExpResult);

	}

	@Test
	public void InvalidUsername() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		Assert.assertEquals(actResult, ExpResult);
}
@Test
	public void InvalidPassword() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		Assert.assertEquals(actResult, ExpResult);
	}
@Test
	public void BothAreBlank() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		Assert.assertEquals(actResult, ExpResult);
}
@Test
	public void TestSymbolicUsername() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("******");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		Assert.assertEquals(actResult, ExpResult);
	}
@Test
	public void TestSymbolicPassword() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("*****");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("&&&&&");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		// testing
		String actResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		Assert.assertEquals(actResult, ExpResult);
	}
@Test
	public void Categories() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories\"]/div[1]/h2")).getText();
		String Expresult = "Categories";
		Assert.assertEquals(actresult, Expresult);
	}
@Test
	public void SubCategories() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"/html/body/header/nav/a[2]")).getText();
		String Expresult = "SubCategories";
		Assert.assertEquals(actresult, Expresult);
	}
@Test
	public void logoutButton() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String actresult = driver.findElement(By.xpath("/html/body/header/nav/a[3]")).getText();
		String Expresult = "logout";
		Assert.assertEquals(actresult, Expresult);
}
@Test
	public void TestAddCategoriesText() {
		String actresult = driver.findElement(By.xpath("//*[@id=\"add-category\"]")).getText();
		String Expresult = "Add Category";
		Assert.assertEquals(actresult, Expresult);
	}
@Test
	public void TestAddCategories() {
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\\\"category-name\\\"]")).getText();
		String Expresult = "English";
		Assert.assertEquals(actresult, Expresult);

	}

	@Test
	public void TestEditButton() {
driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[1]"))
				.getText();
		String Expresult = "Edit";
		Assert.assertEquals(actresult, Expresult);
	}

	@Test
	public void TestDeleteButton() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]"))
				.getText();
		String Expresult = "Delete";
		Assert.assertEquals(actresult, Expresult);
	}
@Test
	public void TestSaveButton() {
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).getText();
		String Expresult = "Save";
		Assert.assertEquals(actresult, Expresult);
	}
@Test
	public void TestCancelButton() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		String actresult = driver.findElement(By.xpath("//*[@id=\"close-modal\"]")).getText();
		String Expresult = "Cancel";
		Assert.assertEquals(actresult, Expresult);
	}
}
