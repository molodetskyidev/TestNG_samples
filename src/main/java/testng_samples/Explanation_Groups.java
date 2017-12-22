package testng_samples;
/* @Test(groups={"group_name1","group_name2"},dependsOnGroups={"group_name3"})
 * allow grouping tests by some groups
 * you can run only selected groups by using corresponded tags in testng.xml. See testng_Groups.xml
 * Console output:
 * BeforeGroups. It's running before groups
 * BMW   - appears because it's from group auto
 * Hundai - appears because it's from group auto
 * Nissan - appears because it's from group auto and also from group japan
 * Sushi  - appears because it's from group japan, failed intentionally in order to skip Kia test method
 * VW - appears because it's from group auto
 * 
 * there also should be AfterGroups output, but there is a bug in TestNG that if one of the test from the group is skipped AfterGroups is not running
 * 
 * Not in console output:
 * Kia - it's from auto group but skipped because some method from japan group fails (Sushi method)
 * Lada - it's from auto group but was not run because it's also from russian group which is excluded in testng_Groups.xml
 * Bretzel - it's not from auto or japan group, so was not run.
 */

public class Explanation_Groups {

}
