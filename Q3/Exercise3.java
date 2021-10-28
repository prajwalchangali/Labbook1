package Labbook1.Q3;

import java.util.Scanner;

public class Exercise3 {
	static void fib(int x) {
		int a=1, b=2,c=0;
		System.out.println(a);
		for(int i=0;i<x;i++)
		{
			c=a+b;
			System.out.println(a+" ");
			a=b;
			b=c;	
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		fib(n);
		sc.close();
	}

}
