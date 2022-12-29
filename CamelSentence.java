/**
 * In this program, please 
 * (1) Accept a string such as "StopAndSmellTheRoses."
 * (2) Convert the string to a sentence in which the words are
 *     separated by spaces and only the first word starts with
 *     an uppercase letter
 * (3) display the string
 * (4) please name your java source file as CamelSentence.java
 * For example:
 * Example 1:
 * input:StopAndSmellTheRoses.
 * output:Stop and smell the roses.

 * Example 2:
 * input:KnowledgeIsPower.
 * output:Knowledge is power.
 */

import java.util.*;

public class CamelSentence {
	
	public static void main(String[] args) {

		// program starts running here.

		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String input = kb.next();

		Camel(input);

		kb.close();
		}


	public static void Camel(String str) {

		StringBuilder output = new StringBuilder();
		output.append(str.charAt(0));

		for(int i = 1; i < str.length(); i++) {
			char c = str.charAt(i);

			if(Character.isUpperCase(c)) {
				output.append(' ');
				output.append(Character.toLowerCase(c));
			}
			else {
				output.append(c);
			}
		}

		System.out.print(output);
	}

}
