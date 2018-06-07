package test;

import java.util.Scanner;

public class InputSample04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("数値の入力お");
		
		if (sc.hasNextInt()){
			int num = sc.nextInt();
			System.out.println("数値は" + num);
		} else {
			System.out.println("数値のにゅううりょくをおねが！");
		}
		sc.close();
	}

}
