package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@SmokeTest")
	public void beforevalidation()
	{
		System.out.println("Hooks Ready");
	}
	@After("@SmokeTest")
	public void Aftervalidation()
	{
		System.out.println("Hooks Closed");
	}

}
