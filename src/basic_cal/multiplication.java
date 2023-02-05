package basic_cal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class multiplication {

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
	public static void multiplication_TC_01()
	{
				//initializing webelements
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
				WebElement mulitiplication=driver.findElement(By.id("*"));
				SoftAssert sa=new SoftAssert();
				
				//action and verification
				//testcase 1: 5+10=15
				clear.click();
				five.click();
				mulitiplication.click();
				one.click();
				zero.click();
				equals.click();
				sa.assertEquals(equation.getText(), "5*10","Equation is not matching");
				sa.assertEquals(result.getText(),"50","result is not matching");
				sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void multiplication_TC_02()
	{
				//initializing webelements
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
				WebElement mulitiplication=driver.findElement(By.id("*"));
				SoftAssert sa=new SoftAssert();
				
				//action and verification
				//testcase 1: 5+10=15
				clear.click();
				five.click();
				mulitiplication.click();
				minus.click();
				one.click();
				zero.click();
				equals.click();
				sa.assertEquals(equation.getText(), "5*-10","Equation is not matching");
				sa.assertEquals(result.getText(),"-50","result is not matching");
				sa.assertAll();
	}
	@Test(dependsOnMethods= {"setup"})
	public static void multiplication_TC_03()
	{
				//initializing webelements
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
				WebElement multiplication=driver.findElement(By.id("*"));
				WebElement signChng=driver.findElement(By.id("+/-"));
				SoftAssert sa=new SoftAssert();
				
				//action and verification
				//testcase 1: 5+10=15
				clear.click();
				five.click();
				signChng.click();
				multiplication.click();
				minus.click();
				two.click();
				equals.click();
				
				sa.assertEquals(equation.getText(), "-5*-2","Equation is not matching");
				sa.assertEquals(result.getText(),"10","result is not matching");
				sa.assertAll();
	}
	
	
	

	@AfterClass
	public static void tear() {
		driver.close();
	}
	
}
