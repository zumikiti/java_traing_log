package test;

import java.util.Scanner;

public class InputSample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("数値の入力");
		
		while(sc.hasNext()){
			int num01 = sc.nextInt();
			System.out.println("入力された数値は、" + num01);
		}
		sc.close();
	}

}
