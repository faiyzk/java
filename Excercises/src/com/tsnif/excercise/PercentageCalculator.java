package com.tsnif.excercise;
import java.util.Scanner;

public class PercentageCalculator {
	public static void main(String[] args) {
//		System.out.println("start");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Total");
		float total = sc.nextFloat();
		System.out.println("Enter Marks of Hindi");
		float h  = sc.nextFloat();
		System.out.println("Enter mArks of english");
		float e = sc.nextFloat();
		System.out.println("enter marks of algebra");
		float a = sc.nextFloat();
		System.out.println("Enter marks of geomtry");
		float g = sc.nextFloat();
		
		
	    float sum =  h+e+a+g;
		float div = sum / total;
		float percentage = div*100;
				System.out.println("Your percentage is "+percentage+ "%");
		sc.close();
		
		
	}

}
