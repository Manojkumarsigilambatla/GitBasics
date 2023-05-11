package JavaBasics;

import java.util.Scanner;

public class Int {
	
	public static int i=10;
	public static void main(String[] args) {
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		//sc.nextLine();
		String s=sc.nextLine();
		
		System.out.println(s +" "+ i);
		System.out.println("hello");
	}

}
