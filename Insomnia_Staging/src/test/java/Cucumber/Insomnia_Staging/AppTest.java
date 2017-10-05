package Cucumber.Insomnia_Staging;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase {
	
	public AppTest(String testName) {
		super(testName);
		System.out.println("TestCase");
		
	}

	
	public static Test suite() {
		System.out.println("TestCase");
		return new TestSuite(AppTest.class);
	}

	
	public void testApp() {
		System.out.println("TestCase");
		assertTrue(true);
	}
}
