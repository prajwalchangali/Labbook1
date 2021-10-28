package Labbook1.Q2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("1=red 2= yellow 3= green ");
	System.out.println("Enter the choice ");
	int c=sc.nextInt();
	sc.close();
	switch(c) {
	case 1:
		System.out.println("stop");
		break;
	case 2:
		System.out.println("wait");
		break;
	case 3:
		System.out.println("Go");
		break;	
	default :
		System.out.println("invalid color");
	}
	
}
}



