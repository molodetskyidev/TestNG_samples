package utils;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//another way  public class CustomListener extends TestListenerAdapter {
public class CustomListener implements ITestListener, ISuiteListener {

	public void onTestFailure(ITestResult tr) {
		log(tr.getMethod().getMethodName() + "--Test method failed\n");
	}

	public void onTestSkipped(ITestResult tr) {
		log(tr.getMethod().getMethodName() + "--Test method skipped\n");
	}

	public void onTestSuccess(ITestResult tr) {
		log(tr.getMethod().getMethodName() + "--Test method success\n");
	}

	private void log(String string) {
		System.out.print(string);
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onStart(ISuite suite) {
		System.out.println("Test suite " + suite.getName() + " is started");

	}

	public void onFinish(ISuite suite) {
		System.out.println("Test suite " + suite.getName() + " is finished");

	}
}