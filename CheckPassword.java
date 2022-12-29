/**
 * Imagine you are developing a software package for Amazon.com
 * that requires users to enter their own passwords. 
 * Your software requires that users' passwords meet the following
 * criteria:
 * (1) The password should be at least six characters long
 * (2) The password should contain at least one uppercase and
 * at least one lowercase letter
 * (3) The password should have at least one digit
 * (4) If the password meet the requirement, please display 
 * "true", otherwise, display "false".
 * Please write a program and name it CheckPassword.java
 * For example:
 * Example 1:
 * input: "1234"
 * output: false
 * Example 2: "Abc123!"
 * output: true
 */

import java.util.*;

public class CheckPassword {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your password: ");
		String password = kb.nextLine();
		PasswordCheck(password);
	}
		
	public static void PasswordCheck(String str) {
		
		boolean passFlag = false;
		boolean digitFlag = false;
		boolean upperFlag = false;
		boolean lowerFlag = false;
		int minChar = 6;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.length() < minChar) {
				break;
			}
			
			char c = str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				upperFlag = true;
			}
			if(Character.isLowerCase(c)) {
				lowerFlag = true;
			}
			if(Character.isDigit(c)) {
				digitFlag = true;
			}
		}
		
		if(digitFlag && upperFlag && lowerFlag) {
			passFlag = true;
		}
		
		System.out.print(passFlag);
	}
}
