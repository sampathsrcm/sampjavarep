package example;

import static org.testng.Assert.assertEquals;
import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myjava.Greeter;

public class TestGreeter {
	private Greeter greeter;
	
	@BeforeTest
	public void setup() {
		
		System.out.println("inside setUp firing-1");
		greeter = new Greeter();
		System.out.println("inside setUp firing-2");
	}
	
	@Test
	public void greetershouldincludetheonebeinggreeted() {
		String someone = "World";
		
		System.out.println("someone" + someone);
		if (greeter == null)
			
		{System.out.println("greeter is null"); }
		else
		{String s = greeter.greet(someone);
		assertEquals(s, someone); }
		
	}
	
	

}
