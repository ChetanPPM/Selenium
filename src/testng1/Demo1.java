package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test(priority=2)
	public void Tc1() 
	{
		System.out.println("Open Browser");
		Reporter.log("chetan",true);
	}
	@Test(priority=1)
	public void Tc2() 
	{
		System.out.println("Open url");
		
	}
	@Test()
	public void Tc4() 
	{
		Reporter.log("Using reporterLogin TC4",true);
		
	}
	@Test()
	public void Tc3() 
	{
		Reporter.log("display email",true);
		
	}

}
