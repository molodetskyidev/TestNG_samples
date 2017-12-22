package utils;

import org.testng.annotations.DataProvider;

public class MyDataProviders {
	@DataProvider(name = "hello") // Provides data for test
	public static Object[][] dp() {
		return new Object[][] { new Object[] { 3, "c" } };
	}
}
