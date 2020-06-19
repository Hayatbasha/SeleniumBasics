package testNG;

import org.testng.annotations.Test;

public class DriveaBike {
@Test(priority = 0)
	public void startTheBike(){
		System.out.println("Start the Bike");
	}
@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("put first Gear");
	}
@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("put Second Gear");
	}
@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("put Third Gear");
	}
}
