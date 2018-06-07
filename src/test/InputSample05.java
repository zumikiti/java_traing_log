package test;

import java.util.Scanner;

public class InputSample05 {
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("数値の入力をしましょう。");
		
		while(true){
			if(sc.hasNextInt()){
				num = sc.nextInt();
				break;
			} else {
				System.out.println("数値を入力してください。");
				sc.next();
			}
		}
		System.out.println("数値は" + num);
		sc.close();
	}

}
