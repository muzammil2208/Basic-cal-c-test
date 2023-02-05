package basic_cal;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class modulos {
  
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
	public static void modulos_TC_01()
	{
		//5%2=2
		WebElement five=driver.findElement(By.id("5"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement mod=driver.findElement(By.id("%"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement equals=driver.findElement(By.id("="));
		
		//actions
		clear.click();
		five.click();
		mod.click();
		two.click();
		equals.click();
		
		//assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(equation.getText(), "5%2","Equation not proper");
		sa.assertEquals(result.getText(),"1","Result not correct");
		sa.assertAll();
		
		
	}
	@Test(dependsOnMethods= {"setup"})
	public static void modulos_TC_02()
	{
		//-5%2=2
		WebElement five=driver.findElement(By.id("5"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement mod=driver.findElement(By.id("%"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement signChange=driver.findElement(By.id("+/-"));
		WebElement equals=driver.findElement(By.id("="));
		
		//actions
		clear.click();
		five.click();
		signChange.click();
		mod.click();
		two.click();
		equals.click();
		
		//assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(equation.getText(), "-5%2","Equation not proper");
		sa.assertEquals(result.getText(),"-1","Result not correct");
		sa.assertAll();
		
		
	}
	@Test(dependsOnMethods= {"setup"})
	public static void modulos_TC_03()
	{
		//-5%-2=2
		WebElement five=driver.findElement(By.id("5"));
		WebElement two=driver.findElement(By.id("2"));
		WebElement mod=driver.findElement(By.id("%"));
		WebElement clear=driver.findElement(By.id("ac"));
		WebElement minus=driver.findElement(By.id("-"));
		WebElement signCh=driver.findElement(By.id("+/-"));
		WebElement result=driver.findElement(By.className("answer"));
		WebElement equation=driver.findElement(By.className("equation"));
		WebElement equals=driver.findElement(By.id("="));
		
		//actions
		clear.click();
		five.click();
		signCh.click();
		mod.click();
		minus.click();
		two.click();
		equals.click();
		
		//assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(equation.getText(), "-5%-2","Equation not proper");
		sa.assertEquals(result.getText(),"-1","Result not correct");
		sa.assertAll();
		
		
	}
	
	@AfterClass
	public void tear() {
		driver.close();
	}
	
}
