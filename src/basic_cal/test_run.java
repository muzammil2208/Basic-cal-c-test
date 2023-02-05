package basic_cal;

import org.testng.TestNG;

public class test_run {
	
	static TestNG tng;
	public static void main(String args[])
	{
		tng=new TestNG();
		tng.setTestClasses(new Class[] {addition.class});
		tng.run();
	}
}
