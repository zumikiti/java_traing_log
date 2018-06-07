package test;

import java.util.Scanner;

public class InputSample01 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("何かを入力してみましょう！");
		String testStr = sc.next();
		System.out.println("入力の文字は、" + testStr);
		sc.close();
		
	}
}
