package basic_cal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class division {

static WebDriver driver=new ChromeDriver();
	
	@Test(priority=0)
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\TestNG framework\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://basic-cal.onrender.com/");
		WebElement togglebtn=driver.findElement(By.className("toggle-button-container"));
		Assert.assertEquals(true, togglebtn.isDisplayed(),"Calculator web page unsuccessful");
	}
	
	@Test(dependsOnMethods= {"setup"})
	public static void division_TC_01()
	{
		// 10/5=2
		WebElement one=driver.findElement(By.id("1"));
		WebElement zero=driver.findElement(By.id("0"));
		WebElement five=driver.findElement(By.id("5"));
		WebElement division=driver.findElement(By.id("/"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement clear=driver.findElement(By.id("ac"));
		SoftAssert sa=new SoftAssert();
		
		//action and verification
		//testcase 1: 5+10=15
		clear.click();
		one.click();
		zero.click();
		division.click();
		five.click();
		equals.click();
		
		sa.assertEquals(equation.getText(), "10/5","Equation is not matching");
		sa.assertEquals(result.getText(),"2","result is not matching");
		sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void division_TC_02()
	{
		// 10/-3=-3.33
		WebElement one=driver.findElement(By.id("1"));
		WebElement zero=driver.findElement(By.id("0"));
		WebElement three=driver.findElement(By.id("3"));
		WebElement minus=driver.findElement(By.id("-"));
		WebElement division=driver.findElement(By.id("/"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement clear=driver.findElement(By.id("ac"));
		SoftAssert sa=new SoftAssert();
		
		//action and verification
		//testcase 1: 5+10=15
		clear.click();
		one.click();
		zero.click();
		division.click();
		minus.click();
		three.click();
		equals.click();
		
		sa.assertEquals(equation.getText(), "10/-3","Equation is not matching");
		sa.assertEquals(result.getText(),"-3.33","result is not matching");
		sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void division_TC_03()
	{
		// -5/-2=2.50
		
		WebElement five=driver.findElement(By.id("5"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement signchng=driver.findElement(By.id("+/-"));
		WebElement minus=driver.findElement(By.id("-"));
		WebElement division=driver.findElement(By.id("/"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement clear=driver.findElement(By.id("ac"));
		SoftAssert sa=new SoftAssert();
		
		//action and verification
		//testcase 1: 5+10=15
		clear.click();
		five.click();
		signchng.click();
		division.click();
		minus.click();
		two.click();
		equals.click();
		
		sa.assertEquals(equation.getText(), "-5/-2","Equation is not matching");
		sa.assertEquals(result.getText(),"2.50","result is not matching");
		sa.assertAll();
	}
	@AfterClass
	public static void tear()
	{
		driver.close();
	}
}
