package testng_samples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationsTest {

	@Test(dataProvider = "dp") // datat is taken from dataProvider with name dp
	public void Test1(Integer n, String s) {
		System.out.println("Test1 is running");
		System.out.println(n + " " + s);
	}

	public void NotTest() {
		System.out.println("some method without Test annotation");
	}

	@Test
	public void Test2() {
		System.out.println("Test2 is running");
	}

	@Test
	public void Test3() {
		System.out.println("Test3 is running");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod is running");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod is running");
	}

	@DataProvider(name = "dp", parallel = false) // Provides data for test
	// The name of this data provider. If it's not supplied, the name of this
	// data provider will automatically be set to the name of the method.
	// If set to true, tests generated using this data provider are run in
	// parallel. Default value is false.
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass is running");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass is running");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest is running");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest is running");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite is running");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite is running");
	}

}
