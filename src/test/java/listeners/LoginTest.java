package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login By Email");
		Assert.assertEquals("sai", "sai");
	}
	
	@Test
	public void loginByFacebook()
	{
		System.out.println("Login By Facebook");
		Assert.assertEquals("kumar", "kumar");
	}

}
