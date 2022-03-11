import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bridgelabz.SampleEmails;
import bridgelabz.UserRegistration;

public class UserTest {
	/**
	 * PROCEDURE:
	 * 
	 */
	/**
	 * 1.Creating object for UserRegistration class
	 */
	UserRegistration u=new UserRegistration();
	/**
	 * 2.Test method to check first name is valid
	 */
	@Test
	public void checkValidFirstName()
	{
		boolean result=u.firstNameofUser("Mou");
		assertTrue(result);
	}
	/**
	 * 3.Test method to check first name is invalid
	 */
	@Test
	public void checkInValidFirstName()
	{
		boolean result=u.firstNameofUser("Mouni");
		assertFalse(result);
	}
	/**
	 * 4.Test method to check last name is valid
	 */
	@Test
	public void checkValidLastName()
	{
		boolean result=u.lastNameofUser("Jav");
		assertTrue(result);
	}
	/**
	 * 5.Test method to check first name is invalid
	 */
	@Test
	public void checkInValidLastName()
	{
		boolean result=u.lastNameofUser("Java");
		assertFalse(result);
	}
}
