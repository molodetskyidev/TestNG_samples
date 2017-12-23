package testng_samples;
/*
 * @Test(dependsOnMethods = { "TestFailed" }, priority = 3) - dependsOnMethods - makes test method skipped if method on which it depends failed
 * priority sets order of test method execution
 * @Test(dependsOnMethods = { "TestFailed" }, alwaysRun = true, priority = 4) - alwaysRun=true - makes test method running even if method on which it depends failed
 * @Test(description = "some description here", priority = 1) - description adds some test method description visible in output
 * @Test(enabled = false, priority = 6) - enable=false disables test method for execution
 * @Test(expectedExceptions = ArithmeticException.class, priority = 7) - expectedExceptions allows to make negative test cases and check that tested function returns correct exception
 * @Test(invocationCount = 3, priority = 5) - invoke test method several times , parameter is not changed
 * @Test(timeOut = 1, priority = 8) - timeOut is set in milliseconds and allow to fail test method if it takes more time to complete than timeOut
 * 
 * Console output:
 * 
 * 
 * Test(priority 1) with description - this test is running first, because priority=1
 * Test(Priority 2 ) is failing - this test is failing
 * Test(Priority 5) is running 1 times - this test is running 3 times because invocationCount = 3
 * Test(Priority 5) is running 2 times
 * Test(Priority 5) is running 3 times
 * Test (priority 7) is running - this test throws exception, but because expectedExceptions = ArithmeticException.class, test is passed
 * Test(priority 8) is running - this test fails because of timeOut=1
 * Test(priority 4) is running even if it depends on fail test because alwaysRun is set true 
 * PASSED: TestWithDescription
 *       some description here
 * PASSED: TestRunning3Times
 * PASSED: TestRunning3Times
 * PASSED: TestRunning3Times
 * PASSED: TestWithException
 * PASSED: TestAlwaysRun
 * FAILED: TestFailed
 * java.lang.AssertionError: expected [true] but found [false]
 * ....
 * FAILED: TestFailedByTimeOut
 * org.testng.internal.thread.ThreadTimeoutException: Method org.testng.internal.TestNGMethod.TestFailedByTimeOut() didn't finish within the time-out 1
 * ....
 */

public class Explanation_TestAnnotation {

}
