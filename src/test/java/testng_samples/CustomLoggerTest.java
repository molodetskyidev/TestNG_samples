package testng_samples;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utils.CustomListener2.class)

public class CustomLoggerTest {

	@Test
	public void testMethodOne() {
		System.out.println("testMethodOne is running");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethodTwo() {
		System.out.println("testMethodTwo is running");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "testMethodTwo" })
	public void testMethodThree() {
		System.out.println("testMethodThree is running");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void sayOops(ITestResult tr) {
		if (tr.getStatus() == tr.FAILURE) {
			System.out.println(tr.getMethod().getMethodName() + ": Oops, I did it again");
		}

	}
}
