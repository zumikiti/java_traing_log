package test;

import java.util.Random;

public class kadai5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//課題1 Randomクラスを利用して、0-100の間で整数をランダムに1つ表示させましょう。
		System.out.println("課題1 Randomクラスを利用して、0-100の間で整数をランダムに1つ表示させましょう。");
		Random ran = new Random();
		//System.out.println(ran);
		int result = ran.nextInt(101);
		/*while (result != 100){
			result = ran.nextInt(101);
		}*/
		
		System.out.println(result);
		
		
		//課題2 Mathクラスを利用して、実行するたびに1-6の数値をランダムに表示させましょう。
		System.out.println("");
		System.out.println("課題2 Mathクラスを利用して、実行するたびに1-6の数値をランダムに表示させましょう。");
		/*
		////do~whileを使うパターン。
		int result2a;
		do {
			double ran2a = Math.random() * 10;
			result2a = (int) Math.ceil(ran2a);
		} while( result2a > 6 );
		System.out.println(result2a);
		*/
		////randomに6掛けるパターン。
		double ran2b = Math.random() * 6;
		int result2b = (int) Math.ceil(ran2b);
		System.out.println(result2b);
		
		
		//課題3 Mathクラスを利用して、ランダムな値(1-10)の値を10回表示しましょう。
		System.out.println("");
		System.out.println("課題3 Mathクラスを利用して、ランダムな値(1-10)の値を10回表示しましょう。");
		int result3;
		for(int i = 0; i<10; i++){
			result3 = (int) (Math.random() * 10) +1;
			System.out.println(result3);
		}
		
		
		//課題４　Mathクラスを利用して、10個のサイコロを振ります。
		//　　　　一個目X、二個目Y……とすべてのサイコロの値と出た目の合計値を表示しましょう。
		System.out.println("");
		System.out.println("課題４　Mathクラスを利用して、10個のサイコロを振ります。");
		System.out.println("一個目X、二個目Y……とすべてのサイコロの値と出た目の合計値を表示しましょう。");
		int saikoro;
		int deme;
		int goukei = 0;
		for(int j = 0; j<10; j++){
			deme = deme();
			saikoro = j + 1;
			System.out.println(saikoro + "個目：" + deme);
			goukei = goukei + deme;
		}
		System.out.println("出た目の合計値：" + goukei);
	}

	//課題4の別メソッド。
	private static int deme() {
		// TODO Auto-generated method stub
		double ran4 = Math.random() * 6;
		int deme = (int) Math.ceil(ran4);
		
		return deme;
	}

}
