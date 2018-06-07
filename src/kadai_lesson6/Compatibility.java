package kadai_lesson6;

import java.util.Scanner;

public class Compatibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;
		String b;
		int num_a;
		int num_b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("１人目のお名前は？");
		a = sc.next(); //一人目の名前を格納
		System.out.println("２人目のお名前は？");
		b = sc.next(); //二人目の名前を格納
		sc.close();
		
		//それぞれのバイト数を取得。
		num_a = tobyte(a);
		//System.out.println("一人目は、" + num_a);
		num_b = tobyte(b);
		//System.out.println("二人目は、" + num_b);
		
		//二人ぶんの値を渡して診断。
		diagnosis(num_a, num_b);
		
		
	}

	//診断のメソッド
	private static void diagnosis(int num_a, int num_b) {
		int num = (num_a + num_b) % 10;
		//System.out.println("a: " + num_a + ", b: " + num_b + ", num: " + num);
		num = Math.abs(num);
		
		System.out.println("二人の相性は10段階で" + num + "です");
		
		if (num == 0){
			System.out.println("相性バツグン！");
		} else if(num < 4) {
			System.out.println("相性はとてもいいですね");
		} else if(num < 8){
			System.out.println("相性はそこそこです。");
		} else {
			System.out.println("相性は。。。頑張ってください。");
		}
	}

	//文字列をバイド数に変換するメソッド
	private static int tobyte(String str) {
		byte[] bytes = str.getBytes();
		int num = 0;
		
		for(int i =0; i < bytes.length; i++){
			//System.out.println(bytes[i]);
			num = num + bytes[i];
		}
		
		return num;
	}

}
