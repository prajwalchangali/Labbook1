package Labbook1.Q1;

import java.util.Scanner;

public class Exercise1 {
	static void add(int x)
	{
		
		int s=0,c;
		
		for(int i=1;i<=x;i++)
		{
			c=i*i*i;
			s=s+c;
			
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=sc.nextInt();
		sc.close();
		add(n);	
	}

}
