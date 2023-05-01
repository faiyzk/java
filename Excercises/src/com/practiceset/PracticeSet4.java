package com.practiceset;
import java.util.Scanner;



public class PracticeSet4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
		
//		Scanner sc = new Scanner(System.in);
//		Question1
//		
//		int age  = sc.nextInt();
//		if(age == 11) {
//			System.out.println("I am 11");
//		}
//		else {
//			System.out.println("I am not 11");
//		}
		
//		Question2
//		float subject1 = sc.nextFloat();
//		float subject2 = sc.nextFloat();
//		float subject3 = sc.nextFloat();
//		float percentage = ((subject1 + subject2 + subject3)/300)*100;
//		System.out.println("Percentage is " + percentage);
//		
//		
//		if(percentage >= 40.0 && subject1>=33 && subject2 >= 33 && subject3 >= 33) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
//		QUESTION 3
//		int income = sc.nextInt();
//		float slab_1 = (income / 100)*5;
//		float slab_2 = (income / 100)*20;		
//		float slab_3 = (income / 100)*30;
//		
//		if (income <= 250000) {
//			System.out.print("No Tax");
//		}
//		else if(income <= 500000) {
//			System.out.print("Tax Applicable On You is " + slab_1);
//		}
//		else if (income <= 500000) {
//			System.out.print("Tax Applicable On You is " + slab_2);
//		}
//		else {
//			System.out.print("Tax Applicable On You is " + slab_3);
//		}
		
//		Question 4
//		int day = sc.nextInt(); 
//		
//		switch (day) {
//		case 1 -> System.out.print("sunday");
//		case 2 -> System.out.print("Monday");
//		case 3 -> System.out.print("Tuesday");
//		case 4 -> System.out.print("Wednesdy");
//		case 5 -> System.out.print("Thursday");
//		case 6 -> System.out.print("Friday");
//		case 7 -> System.out.print("Saturday");
//		
//		default -> System.out.print("Not mentioned");
//		}
		
		
//		sc.close();
		
	}

}
