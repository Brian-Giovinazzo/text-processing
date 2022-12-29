/*
 * Remove duplicate letters in a string.
 * Givin a string S of lowercase letters, a duplicate removal 
 * consists of choosing two adjacent and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * Example 1
 * input: "xyyxzx"
 * output: "zx"
 * Explanation: In "xyyxzx", the first round removal is "yy".
 * After "yy" has been removed, the string is "xxzx". Then, in the next round,
 * "xx" will be removed. "zx" is the final result.
 * Please name your java file as RemoveDuplicates.java
 */

import java.util.*;

public class RemoveDuplicates {
  
	public static void main(String[] args) {
		// program starts here.
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a word to remove duplicates from: ");
		String S = kb.nextLine();
		Excise(S); 
		kb.close();
	}
	
	public static void Excise(String s) {
		
		for(int i = 1; i < s.length(); i++) {
			if(s.length() < 2) {
				break;
			}
			
			char c = s.charAt(i-1);
			char d = s.charAt(i);
			
			if(c == d) {
				String sNew = s.substring(i-1, i+1);
				s = s.replaceFirst(sNew, "");
				i = 0;
			}	
		}
		
		System.out.print(s);
	}
  
}
