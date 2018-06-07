package test;

import java.util.Scanner;

public class InputSample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("繰り返し入力です。");
		
		while(sc.hasNext()){
			String testStr = sc.next();
			System.out.println("入力されたのは、" + testStr);
		}
		sc.close();
	}

}
