import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bridgelabz.SampleEmails;
import bridgelabz.UserRegistration;

public class UserTest {
	/**
	 * PROCEDURE:
	 * 1.Creating object for UserRegistration class
	 * 2.Test method to check first name is valid
	 * 3.Test method to check first name is invalid
	 * 4.Test method to check last name is valid
	 * 5.Test method to check  email id is valid
	 * 6.Test method to check email id is invalid
	 * 7.Test method to check  mobile number is valid
	 * 8.Test method to check mobile number is invalid
	 * 9.Test method to check  mobile number is valid
	 * 10.Test method to check mobile number is invalid
	 * 11.Test method to check  sample emails are valid
	 * 12.Test method to check sample emails are invalid
	 */
	/**
	 * 1.Creating object for UserRegistration class
	 */
	UserRegistration u=new UserRegistration();
	SampleEmails se=new SampleEmails();
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
	/**
	 * 5.Test method to check  email id is valid
	 */
	@Test
	public void checkValidEmail()
	{
		boolean result=u.emaiIdofUser("abc@yahoo.com");
		assertTrue(result);
	}
	/**
	 * 6.Test method to check email id is invalid
	 */
	@Test
	public void checkInValidEmail()
	{
		boolean result=u.emaiIdofUser("abc@%*.com");
		assertFalse(result);
	}
	/**
	 * 7.Test method to check  mobile number is valid
	 */
	@Test
	public void checkValidPhone()
	{
		boolean result=u.mobileNumberOfUser("91 9866349586");
		assertTrue(result);
	}
	/**
	 * 8.Test method to check mobile number is invalid
	 */
	@Test
	public void checkInValidPhone()
	{
		boolean result=u.mobileNumberOfUser("457534");
		assertFalse(result);
	}
	/**
	 * 9.Test method to check  mobile number is valid
	 */
	@Test
	public void checkValidPassword()
	{
		boolean result=u.passwordOfUser("Password@123");
		assertTrue(result);
	}
	/**
	 * 10.Test method to check mobile number is invalid
	 */
	@Test
	public void checkInValidPassword()
	{
		boolean result=u.passwordOfUser("Passwor@d@123");
		assertFalse(result);
	}
	/**
	 * 11.Test method to check  sample emails are valid
	 */
	@Test
	public void checkValidEmails()
	{
		boolean result=se.TestForValidEmails();
		assertTrue(result);
	}
	/**
	 * 12.Test method to check sample emails are invalid
	 */
	@Test
	public void checkInValidEmails()
	{
		boolean result=se.TestForInValidEmails();
		assertFalse(result);
	}
}
