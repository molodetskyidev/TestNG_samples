package testng_samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomReporterTest {
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
}
