package groups_samples;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
	@BeforeGroups(groups = { "auto" })
	public void setUp() {
		System.out.println("BeforeGroups. It's running before groups");
	}

	@AfterGroups(groups = { "auto" })
	public void cleanUp() {
		System.out.println("AfterGroups. It's running after groups");
	}

	@Test(groups = { "auto", "german" })
	public void BMW() {
		System.out.println("BMW");
	}

	@Test(groups = { "auto", "german" })
	public void VW() {
		System.out.println("VW");
	}

	@Test(groups = { "auto", "japan" })
	public void Nissan() {
		System.out.println("Nissan");
	}

	@Test(groups = { "german" })
	public void Bretzel() {
		System.out.println("Bretzel");
	}

	@Test(groups = { "japan" })
	public void Sushi() {
		System.out.println("Sushi");
		Assert.assertTrue(false);
	}

	@Test(groups = { "auto" }, dependsOnGroups = { "japan" })
	public void Kia() {
		System.out.println("Kia");
	}

	@Test(groups = { "auto" })
	public void Hundai() {
		System.out.println("Hundai");
	}

	@Test(groups = { "auto", "russian" })
	public void Lada() {
		System.out.println("Lada");
	}
}
