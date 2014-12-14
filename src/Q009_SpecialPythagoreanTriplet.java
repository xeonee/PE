/*
	A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
	
	a^2 + b^2 = c^2
	For example, 3*3 + 4*4 = 9 + 16 = 25 = 5*5.
	
	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
	
	Answer: 31875000
 */

package com.projecteuler.solutions;

public class Q009_SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			for (int j = i+1; j < 1000; j++) {
				int a = j*j-i*i;
				int b = 2*i*j;
				int c = j*j+i*i;
				if(isPythagoreanTriplet(a,b,c)){
					if(a+b+c == 1000){
						System.out.println(a+" "+b+" "+c);
						System.out.println("Number: "+a*b*c);
						break;
					}
				}
			}
		}

	}
	public static boolean isPythagoreanTriplet(int a, int b, int c){
		boolean flag = false;
		if(a*a + b*b == c*c){
			flag = true;
		}
		return flag;
	}
}
