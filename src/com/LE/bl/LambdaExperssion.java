package com.LE.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface FirstName {
	public abstract boolean checkValidFirstUserName(String firstName);
}

interface lastName {
	public abstract boolean checkValidLastName(String lastName);
}

interface Mobilenum {
	public abstract boolean checkValidMobilenumber(String mobilenumber);
}
interface Email {
	public abstract boolean checkValidEmailId(String EmailId);
}
interface pass {
	public abstract boolean checkValidPassword(String Password);
}

public class LambdaExperssion {
	
//	
//	  Purpose: FirstName valid or invalid
//	  Return:True or False
//	 

	public static void main(String[] args) {
		FirstName f1 = (firstName) -> {

			boolean isFirstName;
			String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
			Pattern pattern = Pattern.compile(firstNameRegex);
			if (firstName == null) {
				isFirstName = false;
			}
			Matcher matcher = pattern.matcher(firstName);
			isFirstName = matcher.matches();
			return matcher.matches();
		};
		
		lastName f2 = (lastName) -> {
			boolean isLastName;
			String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern pattern = Pattern.compile(LastNameRegex);
			if (lastName == null) {
				isLastName = false;
			}
			Matcher matcher = pattern.matcher(lastName);
			isLastName = matcher.matches();
			
			return matcher.matches();
		};

		
//		Mobilenum f3 = (mobilenumber) -> {
//			boolean isMobilenumber;// check the validation
//			String MobilenumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
//			Pattern pattern = Pattern.compile(MobilenumberRegex);
//			if (mobilenumber == null) {
//				isMobilenumber = false;
//			}
//			Matcher matcher = pattern.matcher(mobilenumber);
//			isMobilenumber = matcher.matches();
//			return matcher.matches();
//		};

		Email f4 = (EmailId) -> {
			boolean isEmailId;
			String EmailIdRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
			Pattern pattern = Pattern.compile(EmailIdRegex);
			if (EmailId == null) {
				isEmailId = false;
			}
			Matcher matcher = pattern.matcher(EmailId);
			isEmailId = matcher.matches();
			return matcher.matches();
		};

		pass f5 = (password) -> {
			boolean ispassword;
			String passwordRegex = "^[A-Z]{1}[a-z]{7,}[@]{1}[0-9]{1,}$";
			Pattern pattern = Pattern.compile(passwordRegex);
			if (password == null) {
				ispassword = false;
			}
			Matcher matcher = pattern.matcher(password);
			ispassword = matcher.matches();
			return matcher.matches();
		};

		
		System.out.println(f1.checkValidFirstUserName("Sakshee"));
		System.out.println(f2.checkValidLastName("Bhole"));
		//System.out.println(f3.checkValidMobilenumber("91 9975510126"));
		System.out.println(f4.checkValidEmailId("sakshee1@gamil.com"));
		System.out.println(f5.checkValidPassword("Sakshee@123"));
	}
}