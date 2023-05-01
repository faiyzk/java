package com.practiceset;
import java.util.Scanner;

public class PracticeSet3 {
	
	public static void main(String[] args) {
//		Covert To Lowercase
		Scanner sc = new Scanner(System.in);
		
		String lower = sc.nextLine();
		System.out.println(lower.toLowerCase());
		
//		replace spaces with under score
		System.out.println(lower.replace(" ", "_"));
		
//		DetectDoubleAndTripleSpace;
		System.out.println(lower.indexOf("  "));
		System.out.println(lower.equals("  "));
		
//		Fill In A Letter Template
		System.out.println(" \"Dear <|faiyz|> , Thanks alot \"");
	}

	

}
