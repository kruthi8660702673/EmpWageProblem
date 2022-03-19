package com.airthmatic;

public class Arithmatic {
		public int add(int a, int b) {
			return a+b;			
}
			public int add(double a, double b) {
				return (int) (a+b);
			}
		public static void main(String[]args) {
			Arithmatic main = new Arithmatic() ;
			System.out.println(Math.addExact(4, 5));
			
		}
}
