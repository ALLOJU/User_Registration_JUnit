package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public String regex;
	/**
	 * Method to perform validations on user input as first name
	 * @param firstName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean firstNameofUser(String firstName) {
		/**
		 *  Regex to check valid username.
		 */


		 regex="^[A-Z][a-z]{2}";

		/**
		 * To compile Regular Expression
		 */
		Pattern p=Pattern.compile(regex);
		// If the firstName is empty
		// return false
		if (firstName == null) {
			return false;
		}

		/**
		 * Pattern class contains matcher() method  to find matching between given firstName
           and regular expression.
		 */
		Matcher m=p.matcher(firstName);
		System.out.println(m.matches());
		if(m.matches()==true) {
			System.out.println("First Name Valid");
		}
		else {
			System.out.println("First name should start with Capital letter and has minimum 3 character");

		}
		return m.matches();
	}
	/**
	 * Method to perform validations on user input as last name
	 * @param lastName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean lastNameofUser(String lastName) {
		regex="^[A-Z][a-z]{2}";
		Pattern p=Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(lastName);
		System.out.println(m.matches());
		if(m.matches()==true) {
			System.out.println("Last Name  Valid");
		}
		else {
			System.out.println("Last name should start with Capital letter and has minimum 3 character");

		}
		return m.matches();
	}
	/**
	 * Method to perform validations on user input as Emails
	 * @param email - email ids of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean emaiIdofUser(String email) {
		regex="^[\\w!#$%&�*+/=?`{|}~^-]+(?:\\.[\\w!#$%&�*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p=Pattern.compile(regex);
		
		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(email);
		System.out.println(m.matches());
		if(m.matches()) {
			System.out.println("Email Id  Valid");
		}
		else {
			System.out.println("Email Id Not Valid");

		}
		return m.matches();
	}
	/**
	 * Method used to perform mobile number validations using regular expression
	 * @param phone - input phone number given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean mobileNumberOfUser(String phone) {
		
		regex="^([0-9]{2}[\\s]){1}[0-9]{9,10}$";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(phone);
		System.out.println(m.matches());
		if(m.matches()) {
			System.out.println("Phone NUmber is Valid");
		}
		else {
			System.out.println("Phone NUmber is Not Valid");

		}
		return m.matches();
	}
	/**
	 * Method used to perform password  validations using regular expression
	 * As a User need to follow pre-defined Password rules.
	 * Rule 1 : Minimum 8 characters
	 * Rule 2 : Should have at least 1 Upper Case
	 * Rule 3 : Should have at least 1 numeric number in the password
	 * Rule 4 : Has exactly 1 Special Character
	 * @param password - input password given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean passwordOfUser(String password) {
		regex="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(password);
		System.out.println(m.matches());
		if(m.matches()) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println(" Password is Not Valid");

		}
		return m.matches();
	}
	

}
