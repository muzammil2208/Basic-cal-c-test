package basic_cal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class subtraction {

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
	public static void subtraction_TC_01()
	{
		//10-5=5
		WebElement five=driver.findElement(By.id("5"));
		WebElement one=driver.findElement(By.id("1"));
		WebElement zero=driver.findElement(By.id("0"));
		WebElement add=driver.findElement(By.id("+"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement minus=driver.findElement(By.id("-"));
		SoftAssert sa=new SoftAssert();
		
		//actions
		clear.click();
		one.click();
		zero.click();
		minus.click();
		five.click();
		equals.click();
		sa.assertEquals(equation.getText(), "10-5","Equation is not matching");
		sa.assertEquals(result.getText(),"5","result is not matching");
		sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void subtraction_TC_02()
	{
		//2-5=-3
		WebElement five=driver.findElement(By.id("5"));
		WebElement one=driver.findElement(By.id("1"));
		WebElement zero=driver.findElement(By.id("0"));
		WebElement add=driver.findElement(By.id("+"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement minus=driver.findElement(By.id("-"));
		SoftAssert sa=new SoftAssert();
		
		//actions
		clear.click();
		two.click();
		minus.click();
		five.click();
		equals.click();
		sa.assertEquals(equation.getText(), "2-5","Equation is not matching");
		sa.assertEquals(result.getText(),"-3","result is not matching");
		sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void subtraction_TC_03()
	{
		//-5-3=-8
		WebElement five=driver.findElement(By.id("5"));
		WebElement one=driver.findElement(By.id("1"));
		WebElement three=driver.findElement(By.id("3"));
		WebElement zero=driver.findElement(By.id("0"));
		WebElement add=driver.findElement(By.id("+"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement equals=driver.findElement(By.id("="));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement minus=driver.findElement(By.id("-"));
		WebElement signch=driver.findElement(By.id("+/-"));
		SoftAssert sa=new SoftAssert();
		
		//actions
		clear.click();
		five.click();
		signch.click();
		minus.click();
		three.click();
		equals.click();
		sa.assertEquals(equation.getText(), "-5-3","Equation is not matching");
		sa.assertEquals(result.getText(),"-8","result is not matching");
		sa.assertAll();
	}
	
	@AfterClass
	public void tear()
	{
		driver.close();
	}
}
