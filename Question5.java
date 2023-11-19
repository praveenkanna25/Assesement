package test.org;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int a = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= a; i++) {
			System.out.println("enter the string" + " " + i);
			Scanner st = new Scanner(System.in);
			String cha = st.nextLine();
			char[] c = cha.toCharArray();

			for (int k = 0; k <= c.length; k++) {
				for(int j=0;j<c.length-k-1;j++) {
					if(c[j]<c[j+1]) {
						char temp=c[j];
						c[j]=c[j+1];
						c[j+1]=temp;
					}
					}
				}
			for(char l:c) {
				System.out.print(l);
			}
			
			System.out.println();
			
		}}}

