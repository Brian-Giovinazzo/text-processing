/** 
 * Balanced strings are those who have equal quantity of "L" and
 * "R" characters. Given a balanced string s split it in the maximum
 * amount of balanced strings. Return the maximum amount of splitted
 * balanced strings
 * Example 1:
 * input: "RLRRLLRLRL"
 * output: 4
 * Explanation: "RLRRLLRLRL" can be split into "RL", "RRLL", "RL", "RL",
 * since each substring contains the same number of "L" and R"
 * Example 2:
 * input: "RLLLLRRRLR"
 * output: 3
 * Explanation: "RLLLLRRRLR" can be split into "RL", "LLLRRR","LR",
 * since each substring contains the same number of "L" and "R"
 * Example 3:
 * input: "LLLLRRRR"
 * output: 1
 * Explanation: "LLLLRRRR" can be split into "LLLLRRRR"
 * Example 4:
 * input: "RLRRRLLRLL"
 * output: 2
 * Explanation: "RLRRRLLRLL" can be split into "RL", "RRRLLRLL",
 * since each substring contains the same number of "L" and "R"
 * Please write a program to achieve this goal and name it CountBalancedStrings.java
 */

import java.util.Scanner;

public class CountBalancedStrings {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter an RL string: ");
		String s = kb.nextLine();
		System.out.print(Balancer(s));
		kb.close();

	}
	
	public static int Balancer(String str) {
		
		int balancedSubs = 0;
		int r = 0;
		int l = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'R') {
				r++;
			}
			if(c == 'L') {
				l++;
			}
			if(l == r) {
				balancedSubs++;
			}
		}
		
		return balancedSubs;
	}

}
