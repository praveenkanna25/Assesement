package test.org;

import java.util.Scanner;

public class Jumbled{
public static boolean jumb(int n){
while (n != 0)  {
int a = n % 10;
int b = (n/ 10) % 10;
if (Math.abs(a - b) != 1){
return false;
}
n = n / 10;
}
return true;
}
public static void main(String[] args){
	System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(jumb(n)){
System.out.println("given number is jumbled");
}
else{
System.out.println("given number is not a jumbled ");
}
}
}
