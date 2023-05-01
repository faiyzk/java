package com.practiceset;


//Question1------------------------------------------------------------------
//class Employee{
//	int salary;
//	String name;
//	public int getSalary() {
//		return salary;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String n) {
//		name = n;
//	}
//	
//}

//Question2------------------------------------------------------------------
//class cellPhone{
//	public void rin(){
//		System.out.println("ringing");
//	}
//	public void vibrate(){
//		System.out.println("vibrating");
//	}
//}


//Question 3------------------------------------------------------------------
//class Square{
//	int side;
//	int area;
//	int perimeter;
//	public int side(int n ){
//		return side = n;		
//	}
//	public int area(int n) {
//		return area = n*n;
//	}
//	public int perimeter(int n ) {
//		return perimeter = 4*n;
//	}
//}


//Question 4------------------------------------------------------------------
//class Tommy{
//	public void hit() {
//		System.out.println("Hitting The Enemy");
//	}
//	public void run() {
//		System.out.println("Running From Enemy");
//	}
//	public void fire() {
//		System.out.println("Firing On Enemy");
//	}
//

//recurrsion





public class PracticeSet8 {
//	public static void numb(int n ) {
//		if(n == 6) {
//			return;
//			
//		}
//	
//		System.out.println(n);
//		numb(n+1);
//	}
//--------------------------------------------------------------------------	
//	public static void add(int i, int n ,int sum) {
//		if(i == n) {
//			sum += i;
//			System.out.println(sum);
//			return;
//			
//		}
//		
//		sum+=i;
//		add(i+1,n,sum);	
//		
//		
//	}
//--------------------------------------------------------------------------
	public static void fact(int i ,int n,int mul) {
		if(i == 0 ||i==n) {
			mul *= 1;
			System.out.println(mul);	
			return;
		}
		mul *= i;
		fact(i-1 , n , mul);
	}
	
	public static void main(String[] args) {
		int n = 5;
//		numb(n);
//		add(1,5,0);
		fact(5,1,1);
		
		
		
		
		
//Question1		
//		Employee e = new Employee();
//		e.salary = 1000;
//		System.out.println(e.getSalary());
//		
//		Employee n = new Employee();
//		n.name = "faiz";
//		System.out.println(n.getName());
//		
//		n.setName("Khan");
//		System.out.println(n.getName());
		
//	Question2
		
//		cellPhone c = new cellPhone();
//		c.vibrate();
//		c.rin();
		
		
//	Question 3
//		Square s = new Square();
//		
//		System.out.println(s.side(5));
//		System.out.println(s.area(5));
//		System.out.println(s.perimeter(5));
		
		
//	Question 4
//		Tommy t = new Tommy();
//		t.run();
//		t.hit();
//		t.fire();
//		
		
	}

}
