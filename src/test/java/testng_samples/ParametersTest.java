package testng_samples;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	@Parameters({ "first-name" })

	@Test
	public void TestWithParameter(String firstName) {
		System.out.println("Invoked testString " + firstName);
		assert "Cedric".equals(firstName);
	}

	@Parameters({ "first-name", "last-name" })
	@Test
	public void TestWithOptionalParameter(String firstName, @Optional("Nickolson") String lastName) {

		System.out.println("Invoked testString " + lastName);

		System.out.println("Invoked testString " + firstName);
	}
}
