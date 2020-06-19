package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
@Test(groups = {"Apple"})
	public void Apple1() {
		System.out.println("Apple Testing");
	}
@Test(groups = {"Apple"})

	public void Apple2() {
		System.out.println("Apple Testing");
	}
@Test(groups = {"Lenovo"})

	public void Lenovo1() {
		System.out.println("Lenovo Testing");
	}
@Test(groups = {"Lenovo"})


	public void Lenovo2() {
		System.out.println("Lenovo Testing");
	}
@Test(groups = {"Samsung"})


	public void Samsung1() {
		System.out.println("Samsung Testing");
	}
@Test(groups = {"Samsung"})


	public void Samsung2() {
		System.out.println("Samsung Testing");
	}
}
