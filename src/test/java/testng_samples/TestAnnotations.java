package testng_samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotations {
	static int j = 0;

	@Test(dependsOnMethods = { "TestFailed" }, priority = 3)
	public void TestSkipped() {
		System.out.println("Test(priority 3) is skipped, because it depends on failed test");
	}

	@Test(priority = 2)
	public void TestFailed() {
		System.out.println("Test(Priority 2 ) is failing");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "TestFailed" }, alwaysRun = true, priority = 4)
	public void TestAlwaysRun() {
		System.out.println("Test(priority 4) is running even if it depends on fail test because alwaysRun is set true");
	}

	@Test(description = "some description here", priority = 1)
	public void TestWithDescription() {
		System.out.println("Test(priority 1) with description");
	}

	@Test(enabled = false, priority = 6)
	public void TestDisabled() {
		System.out.println("This test (priority 6) is disabled");
	}

	@Test(expectedExceptions = ArithmeticException.class, priority = 7)
	public void TestWithException() throws Exception {
		System.out.println("Test (priority 7) is running");
		int i = 10 / 0;
	}

	@Test(invocationCount = 3, priority = 5)
	public void TestRunning3Times() {
		j++;
		System.out.println("Test(Priority 5) is running " + j + " times");
	}

	@Test(timeOut = 1, priority = 8)
	public void TestFailedByTimeOut() {
		int m = 0;
		System.out.println("Test(priority 8) is running");
		for (int k = 1; k < 1000000000; k++) {
			m = m++;
		}
	}
}
