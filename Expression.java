package test.org;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
	
		public static boolean isValidExpression(String expression) {
			String str = "^(\\([^()]*\\))*$";
			Pattern pattern = Pattern.compile(str);
			Matcher matcher = pattern.matcher(expression);
			return matcher.matches();
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Expression : ");
			String S=sc.nextLine();
			System.out.println((isValidExpression(S) ? "Valid" : "Invalid"));
			System.out.println();
		}
	}


