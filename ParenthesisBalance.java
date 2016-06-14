/** Check if given sequence of parenthesis is a balanced parenthesis. This question was asked in HackerRank.

Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parentheses can be paired uniquely with a closed parentheses that occurs after the former. Also, the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.
{[()]} – This is a balanced parentheses.
{[(])} – This is not a balanced parentheses.

**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ParenthesisBalance {
  private static boolean checkBalance(String input){
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for(int i=0; i < input.length(); i++){
			String str = ""+input.charAt(i);
			if(str.equals("(") || str.equals("[") || str.equals("{")){
				stack.push(str);
			}

			if(str.equals(")") || str.equals("]") || str.equals("}")){
				if(stack.isEmpty()){
					return false;
				}
				String opening = stack.peek();
				if(str.equals(")") && opening.equals("(")){
					stack.pop();
				}
				if(str.equals("]") && opening.equals("[")){
					stack.pop();
				}
				if(str.equals("}") && opening.equals("{")){
					stack.pop();
				}
			}
		}
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}

		return isBalanaced;
	}


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
				Scanner input=new Scanner(System.in);
				int n=input.nextInt();
				for(int i=0; i<n; i++){
						String line=input.next();
						boolean flag = checkBalance(line);
						if(flag){
								System.out.println("YES");
						} else {
								System.out.println("NO");
						}
				}
		}
}
