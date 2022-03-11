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

}
