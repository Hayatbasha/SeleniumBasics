package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
@Test(enabled = true)
	public void highSchool() {
		System.out.println(" High school passed");
	}
@Test(dependsOnMethods = "highSchool")
	public void HigherSecondary() {
		System.out.println("Higher secondary Passed");
	}
@Test(dependsOnMethods = "HigherSecondary")
	public void Engineering() {
		System.out.println("Engineering passed");
	}
}
