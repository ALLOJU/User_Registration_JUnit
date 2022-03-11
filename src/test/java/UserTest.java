import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bridgelabz.SampleEmails;
import bridgelabz.UserRegistration;

public class UserTest {

	UserRegistration u=new UserRegistration();
	
	@Test
	public void checkValidFirstName()
	{
		boolean result=u.firstNameofUser("Mou");
		assertTrue(result);
	}
	@Test
	public void checkInValidFirstName()
	{
		boolean result=u.firstNameofUser("Mouni");
		assertFalse(result);
	}
	
	
}
