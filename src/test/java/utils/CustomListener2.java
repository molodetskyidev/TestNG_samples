package utils;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener2 implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before starting method: " + method.getTestMethod());

	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After starting method: " + method.getTestMethod());

	}

}
