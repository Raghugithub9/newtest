package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

/*
@BeforeSuite
	@BeforeTest
		@BeforeClass
			@BeforeMethod
				@Test1     - Test Case
			@AfterMethod
			@BeforeMethod
				@Test2     - Test Case
			@AfterMethod
			@BeforeMethod
				@Test3
			@AfterMethod
		@AfterClass
	@AfterTest
@AfterSuite
*/	
	
@BeforeSuite
public void Bsuite() {
	System.out.println("Before Suite");
}



@BeforeTest
public void Btest() {
	System.out.println("Before Test");
}

@AfterTest
public void Atest() {
	System.out.println("After Test");
}

@BeforeClass
public void Bclass() {
	System.out.println("Before Class");
}

@AfterClass
public void Aclass() {
	System.out.println("After Class");
}

@BeforeMethod
public void Bmethod() {
	System.out.println("Before Method");
}

@AfterMethod
public void Amethod() {
	System.out.println("After Method");
}

@Test(priority=3)
public void Test1() {
	System.out.println("Test Case 1");
}

@Test(priority=1)
public void Test2() {
	System.out.println("Test Case 2");
}
@Test(priority=2)
public void Test3() {
	System.out.println("Test Case 3");
}
@Test
public void Test4() {
	System.out.println("Test Case 4");
}
	
	
	
	
	
	
	
	

	


}
