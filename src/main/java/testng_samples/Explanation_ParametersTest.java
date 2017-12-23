package testng_samples;

/* Parameters defined by DataProvider are covered by Explanation_Annotations.java
 * Here it is covered parameters defined by testng.xml
 * <suite name="Suite"> <!-- Suite -->
 * <parameter name="first-name"  value="Cedric"/>
 *	<test name="Suite Test1"> <!-- Test -->
 * in test should be @Parameter annotation:
 * @Parameters({ "first-name" })
 * and test method should have parameter
 * 	public void TestWithParameter(String firstName) {
 * ...
 * There could be also optional parameters
 * @Parameters({ "first-name", "last-name" })
 * optional parameter should have default value which is used while parameter is not set in testng.xml
 * public void TestWithOptionalParameter(String firstName, @Optional("Nickolson") String lastName) {
 * ...
 */
public class Explanation_ParametersTest {

}
