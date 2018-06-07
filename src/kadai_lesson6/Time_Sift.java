package kadai_lesson6;

import java.time.LocalTime;

public class Time_Sift {

	public static void main(String[] args) {
		//時間を取得
		int hour = getHour();
		
		//時間によってMSGを変更
		Time_MSG(hour);
	}

	
	//時間によってMSGを変更するメソッド
	private static String Time_MSG(int hour) {
		
		int TIME1 = 7;
		int TIME2 = 12;
		int TIME3 = 18;
		int TIME4 = 21;
		
		if(hour >= TIME1 && hour <= TIME2){
			System.out.println("おはよう");
		} else if(hour > TIME2 && hour <= TIME3){
			System.out.println("こんにちは");
		} else if(hour > TIME3 && hour <= TIME4){
			System.out.println("こんばんは。");
		} else {
			System.out.println("おやすみ");
		}
		
		return null;
	}

	//時間を取得するメソッド
	private static int getHour() {
		LocalTime lt = LocalTime.now();
		int hour = lt.getHour();
		return hour;
	}

}
