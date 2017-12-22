package testng_samples;
/*
@BeforeSuite: The annotated method will be run before all tests in this suite have run. 
@AfterSuite: The annotated method will be run after all tests in this suite have run. 
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run. 
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run. 
@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked. 
@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked. 
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked. 
@AfterClass: The annotated method will be run after all the test methods in the current class have been run. 
@BeforeMethod: The annotated method will be run before each test method. 
@AfterMethod: The annotated method will be run after each test method.

****************************************************

Note: BeforeGroup and AfterGroup are covered in Explanation_Groups

**************  Console output: ********************

BeforeSuite is running          - coming from AnnotationsTest.java, runs before suite is running
BeforeSuite2 is running         - coming from AnnotationsTest2.java, runs before suite is running
BeforeTest is running           - coming from AnnotationsTest.java, runs before each test (tag test in testng.xml), here for Suite Test1 (see testng_Annotations.xml)
BeforeTest2 is running          - coming from AnnotationsTest2.java, runs before each test (tag test in testng.xml), here for Suite Test1 (see testng_Annotations.xml)
BeforeClass is running          - coming from AnnotationsTest.java, runs before class (class test in testng.xml), here for AnnotationsTest.java class
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test1 method 1st instance
Test1 is running                - Test1 instance 1 is running from AnnotationsTest.java
1 a                             - data coming from DataProvider, first instance of Test1
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test1 method 1st instance
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test1 method 2nd instance
Test1 is running                - Test1 instance 2 is running from AnnotationsTest.java because there is another data came from DataProvider
2 b                             - data coming from DataProvider, second instance of Test1
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test1 method 2nd instance
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test2 method
Test2 is running                - Test2 is running from AnnotationsTest.java
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test2 method
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test3 method
Test3 is running                - Test2 is running from AnnotationsTest.java
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test3 method
AfterClass is running           - coming from AnnotationsTest.java, runs after class (class test in testng.xml), here for AnnotationsTest.java class
BeforeClass2 is running         - coming from AnnotationsTest2.java, runs before class (class test in testng.xml), here for AnnotationsTest2.java class
BeforeMethod2 is running        - coming from AnnotationsTest2.java, runs before each Test method of AnnotationsTest2.java, here for Test4 method
Test4 is running                - Test4 is running from AnnotationsTest2.java
3 c                             - data coming from DataProvider, from external DataProviders class
AfterMethod2 is running         - coming from AnnotationsTest2.java, runs after each Test method of AnnotationsTest2.java, here for Test4 method
BeforeMethod2 is running        - coming from AnnotationsTest2.java, runs before each Test method of AnnotationsTest2.java, here for Test5 method
Test5 is running                - Test5 is running from AnnotationsTest2.java
AfterMethod2 is running         - coming from AnnotationsTest2.java, runs after each Test method of AnnotationsTest2.java, here for Test5 method
AfterClass2 is running          - coming from AnnotationsTest2.java, runs after class (class test in testng.xml), here for AnnotationsTest2.java class
AfterTest is running            - coming from AnnotationsTest.java, runs after each test (tag test in testng.xml), here for Suite Test1 (see testng_Annotations.xml)
AfterTest2 is running           - coming from AnnotationsTest3.java, runs after each test (tag test in testng.xml), here for Suite Test1 (see testng_Annotations.xml)
BeforeTest is running           - coming from AnnotationsTest.java, runs before each test (tag test in testng.xml), here for Suite Test2 (see testng_Annotations.xml)
BeforeClass is running          - coming from AnnotationsTest.java, runs before class (class test in testng.xml), here for AnnotationsTest.java class
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test1 method 1st instance
Test1 is running                - Test1 instance 1 is running from AnnotationsTest.java
1 a                             - data coming from DataProvider, first instance of Test1
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test1 method 1st instance
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test1 method 2nd instance
Test1 is running                - Test1 instance 2 is running from AnnotationsTest.java
2 b                             - data coming from DataProvider, second instance of Test1
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test1 method 2nd instance
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test2
Test2 is running                - Test2 is running from AnnotationsTest.java
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test2
BeforeMethod is running         - coming from AnnotationsTest.java, runs before each Test method of AnnotationsTest.java, here for Test3
Test3 is running                - Test3 is running from AnnotationsTest.java
AfterMethod is running          - coming from AnnotationsTest.java, runs after each Test method of AnnotationsTest.java, here for Test3
AfterClass is running           - coming from AnnotationsTest.java, runs after class (class test in testng.xml), here for AnnotationsTest.java class from Suite Test2
AfterTest is running            - coming from AnnotationsTest.java, runs after each test (tag test in testng.xml), here for Suite Test2 (see testng_Annotations.xml)
AfterSuite is running           - coming from AnnotationsTest.java, runs after suite is running
AfterSuite2 is running          - coming from AnnotationsTest2.java, runs after suite is running
******************************************
 */

public class Explanation_Annotations {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
