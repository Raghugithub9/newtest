package TestNGBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample2 {

@BeforeSuite	
public void LaunchBrowser() {
	System.out.println("Launch Browser");
}

@BeforeTest
public void Login() {
	System.out.println("Login");
}

@Test
public void SendEMail() {
	System.out.println("Send Email");
}

@Test
public void CheckEmail() {
	System.out.println("Send Email");
}


@AfterTest
public void Logout() {
	System.out.println("Logout");
}
@AfterSuite
public void CloseBrowser() {
	System.out.println("Close Browser");
}
	
}
