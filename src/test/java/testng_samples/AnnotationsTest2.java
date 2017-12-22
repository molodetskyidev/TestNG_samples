package testng_samples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2 {

	@Test(dataProviderClass = utils.MyDataProviders.class, dataProvider = "hello")
	public void Test4(int n, String s) {
		System.out.println("Test4 is running");
		System.out.println(n + " " + s);
	}

	@Test
	public void Test5() {
		System.out.println("Test5 is running");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod2 is running");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod2 is running");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass2 is running");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass2 is running");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest2 is running");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest2 is running");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite2 is running");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite2 is running");
	}

}
