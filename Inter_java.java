package pattern;

import java.util.Scanner;

public class Inter_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a input for pattern");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=0;
		int nsp=n-1;
		while(row<n) {
		for(int i=0;i<n-row-1;i++ ) {
			System.out.print(" ");
		}
		for(int j=0;j<=row;j++) {
			System.out.print("*");
			System.out.print(" ");
		}
		row++;
		System.out.println();
		
		}
	}

}
