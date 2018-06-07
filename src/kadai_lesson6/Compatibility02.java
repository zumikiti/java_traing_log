package kadai_lesson6;

import java.time.LocalTime;
import java.util.Scanner;

public class Compatibility02 {

	public static void main(String[] args) {
		/*二人の名前の文字数を実行時の時間でかける。
		 *二人の数字を足した一桁目を抽出。
		 *数字が大きいほどいいことにする。
		 */
		
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
		
		num_a = getNum(a);
		num_b = getNum(b);
		
		diagnosis(num_a, num_b);
	}

	private static void diagnosis(int num_a, int num_b) {
		// TODO Auto-generated method stub
		
		int num = num_a + num_b;
		String str = String.valueOf(num);
		String top_str= str.substring(0, 1);
		int top_num = Integer.valueOf(top_str);
		int result = top_num + 1;
		
		//System.out.println("num_aは" + num_a + ", num_bは" + num_b + ", 足したら" + num);
		System.out.println("二人の相性は10段階で" + result + "です");
		
	}

	private static int getNum(String str) {
		// TODO Auto-generated method stub
		int num = str.length();
		LocalTime lt = LocalTime.now();
		int hour = lt.getHour();
		num = num * hour;
		System.out.println(num);
		return num;
	}

}
